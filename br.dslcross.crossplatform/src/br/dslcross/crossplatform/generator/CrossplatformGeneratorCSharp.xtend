package br.dslcross.crossplatform.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import java.util.ArrayList
import br.dslcross.crossplatform.crossPlatform.Entity
import br.dslcross.crossplatform.crossPlatform.Deploy
import br.dslcross.crossplatform.crossPlatform.PlatformDecl
import br.dslcross.crossplatform.crossPlatform.Platform

import br.dslcross.crossplatform.crossPlatform.Attribute
import br.dslcross.crossplatform.crossPlatform.Operation
import br.dslcross.crossplatform.crossPlatform.CommandPlat
import br.dslcross.crossplatform.crossPlatform.CommandFeature
import br.dslcross.crossplatform.crossPlatform.OperationGlobCallOld



import br.dslcross.crossplatform.crossPlatform.CommandOperation
//import br.dslcross.crossplatform.crossPlatform.AssignmentCmd
import br.dslcross.crossplatform.crossPlatform.ExprArit
import br.dslcross.crossplatform.crossPlatform.Termo
import br.dslcross.crossplatform.crossPlatform.Fator
import br.dslcross.crossplatform.crossPlatform.StringTemplateFreeCod

import br.dslcross.crossplatform.crossPlatform.AbrevCmd
import br.dslcross.crossplatform.crossPlatform.MethodCallCmd
//import br.dslcross.crossplatform.crossPlatform.MethodCallKClassReal
import br.dslcross.crossplatform.crossPlatform.OpLogicoWhile
import br.dslcross.crossplatform.crossPlatform.OpLogicoDoWhile
import br.dslcross.crossplatform.crossPlatform.OpLogicoIF
import br.dslcross.crossplatform.crossPlatform.OpLogicoFor
import br.dslcross.crossplatform.crossPlatform.AssignmentCmdFor	

import br.dslcross.crossplatform.crossPlatform.ExprLogica	
import br.dslcross.crossplatform.crossPlatform.TermoLogico
import br.dslcross.crossplatform.crossPlatform.FatorLogico
import br.dslcross.crossplatform.crossPlatform.OperationGlobal


import br.dslcross.crossplatform.crossPlatform.DSLConcreteTypeRef;
import br.dslcross.crossplatform.crossPlatform.DSLGenericTypeRef
import br.dslcross.crossplatform.crossPlatform.DSLTypeRef;
import br.dslcross.crossplatform.crossPlatform.SpecialCommand
import br.dslcross.crossplatform.crossPlatform.AttribID
import br.dslcross.crossplatform.crossPlatform.CallAttributeObject
import br.dslcross.crossplatform.crossPlatform.Type
import br.dslcross.crossplatform.crossPlatform.MethodCallGlob

import java.net.URI
import br.dslcross.crossplatform.crossPlatform.ExprLogicFor
import br.dslcross.crossplatform.crossPlatform.OpElse
import org.eclipse.emf.ecore.EObject
import br.dslcross.crossplatform.crossPlatform.EntityGlobCall
import br.dslcross.crossplatform.crossPlatform.EntityGlobal
import br.dslcross.crossplatform.crossPlatform.MethodCallGlobal
import br.dslcross.crossplatform.crossPlatform.MethodCallOp
import br.dslcross.crossplatform.crossPlatform.OperationGlobCall
import br.dslcross.crossplatform.crossPlatform.OperationGlobal
import br.dslcross.crossplatform.crossPlatform.DataType
import br.dslcross.crossplatform.crossPlatform.Vector

class CrossplatformGeneratorCSharp extends AbstractGenerator {
	
	//--set controller creation
    val platSeparatedController = newArrayList('Android', 'iOS') //Essas plataformas devem gerar uma classe para cada função declaradas na classe: "controller". Seguindo o formato de desenvolvimento das plataformas móveis
    val varController = "Controller" //Toda classe com o nome de controller, irá gerar classes separadas para as platformas listadas no array platSeparatedController
    //--set controller creation
    
	String EntityPlatform = ""
	String LingDaPlataforma = ""
	String PlataformaDaEntidade = ""
	String NomePlataformaDeclarada = ""
	val listPlatform = new ArrayList<String> // Lista das operações programadas pelo desenvolvedor dentro da declaração de plataformas
	val listFeat = new ArrayList<String> // usado para automatizar o SQL dos insert
	val OpSignPlatlistNome = new ArrayList<String> // Lista dos nomes das operações assinadas programadas pelo desenvolvedor dentro da declaração de plataformas         
	var OpSignPlatArray2D = new2DString2ArrayOfSize(20, 20) // Lista para operações nas plataformas
	Resource res; //Set the resource to verifyArg method
	String platAtual = "" //Set the resource to verifyArg method
	
	            

	@Pure
	static def String[][] new2DString2ArrayOfSize(int nrow, int ncol) {
		newArrayOfSize(nrow).map[newArrayOfSize(ncol)]
	}

	var classOpSignParamArray2D = new2DString2ArrayOfSize(20, 20) // Lista para operações dentro das classes (Entity) 
	val classNomeOperation = new ArrayList<String> // Tipo da operação dentro do Entity         

	@Inject extension IQualifiedNameProvider

	def void GenerateData(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, String EntityPlatform, String NomePlatDeclarada) { // EntityPlatform se refere as entidades que devem ser geradas dentro dessa plataforma
		this.EntityPlatform = EntityPlatform // Recuperando o nome da entity que deve ser gerada
		this.NomePlataformaDeclarada = NomePlatDeclarada
		this.res = resource
		this.platAtual = NomePlatDeclarada
		doGenerate(resource, fsa, context) // Chamando o método doGenerate para geração da classe especifica
		println("GeneratorJava - método GenerateData - Nome da entity :" + EntityPlatform)

	}

	def compileEntityCmd(CommandFeature cmd, Entity e, Resource resource, ArrayList<String> listPlat, ArrayList<String> listFeatures,
		ArrayList<String> classNomeOperation, String[][] classOpSignParamArray2D, String[][] OpSignPlatArray2D,
		ArrayList<String> OpSignPlatlistNome, Boolean PlatEntity, String PlataformaDaEntidade, IFileSystemAccess2 fsa, IGeneratorContext context) { // 13
		if (cmd instanceof Attribute) {
			cmd.compile
		} else if (cmd instanceof Operation) {
			if (PlatEntity.equals(false)) {
				cmd.compileOperation(classNomeOperation, classOpSignParamArray2D) // Classe (Entity)
			} else if (PlatEntity.equals(true)) {
				cmd.compileOperation(OpSignPlatlistNome, OpSignPlatArray2D) // Plataforma
			}

        } else if (cmd instanceof OperationGlobCallOld) {
             compileOperationGlob(cmd, PlataformaDaEntidade, resource) 
		} else if (cmd instanceof EntityGlobCall) {			    
				compileEntityGlob(cmd, PlataformaDaEntidade, resource)
        } else if (cmd instanceof OperationGlobCall) {        	    			    
				compileControllerGlob(cmd, PlataformaDaEntidade, resource, fsa, context)

	
				
		}else if (cmd instanceof StringTemplateFreeCod) {
				compileStringTemplateFreeCod(cmd)
		}else if (cmd instanceof CallAttributeObject) {
				//compileAssignmentCmd(cmd);	
				compileCallAttributeObject(cmd);
		//}else if (cmd instanceof AssignmentCmd) {
		//		compileAssignmentCmd(cmd);
		}
	}
	
	
	def compilePlatCmd(CommandPlat cmd, Entity e, Resource resource, ArrayList<String> listPlat, ArrayList<String> listFeatures,
		ArrayList<String> classNomeOperation, String[][] classOpSignParamArray2D, String[][] OpSignPlatArray2D,
		ArrayList<String> OpSignPlatlistNome, Boolean PlatEntity) { // 13
		if (cmd instanceof Attribute) {
			cmd.compile
		} else if (cmd instanceof Operation) {
			if (PlatEntity.equals(false)) {
				cmd.compileOperation(classNomeOperation, classOpSignParamArray2D) // Classe (Entity)
			} else if (PlatEntity.equals(true)) {
				cmd.compileOperation(OpSignPlatlistNome, OpSignPlatArray2D) // Plataforma
			}
		}
	}	




	def prepareParameters(Operation cF, int i, String varArray){
		//println(" saida param operation: " + cF.params.get(i).ref)
		if (cF.params.get(i).ref === null){
			return cF.params.get(i).type.compileType + varArray + " " + cF.params.get(i).name
		}else if (cF.params.get(i).ref !== null){
		  //return cF.params.get(i).type.compileType.toFirstUpper+"<"+cF.params.get(i).ref.name+">" + varArray + " " + cF.params.get(i).name
			return cF.params.get(i).type.compileType.toFirstUpper+"<"+treatVariableName(cF.params.get(i).ref.name.toString)+">" + varArray + " " + cF.params.get(i).name
		}else{
			return cF.params.get(i).type.compileType + varArray + " " + cF.params.get(i).name
		}		
	}


	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		for (e : resource.allContents.toIterable.filter(Entity)) { // Gerar a entidade de acordo com a EntityPlatform
			println("\n\n\n ------------------------------------------------------ \n")
			println("GeneratorAndroid - método doGenerate - dentro do for - Nome da entidade: " + e.name)

			// ---Recuperar a lista de features da entidade 
			listFeat.clear
			

			// ----------------------------Contabilizando o número de operações dentro da classe (Entity) 
			var countOp = 0
			for (featOp : e.features) {
				if (featOp instanceof Operation) {
					countOp = countOp + 1
				}
			}
			// ----------------------------Contabilizando o número de operações dentro da classe (Entity)               
			classOpSignParamArray2D = new2DString2ArrayOfSize(countOp, 20) // Definindo o tamanho da matriz para armazenar os dados das operaçoes com assinatura dentro da classe (Entity)  	                                  
			classNomeOperation.clear

			var cOpClass = 0			
			for (featVar : e.features) {
				if (featVar instanceof Attribute) {
					listFeat.addAll(featVar.name);
				} else if (featVar instanceof Operation) {					
                    var varArray=""
					for (i : featVar.params.size >.. 0) {
						if(!(featVar.params.get(i).col1===null)){varArray="[]"}else{varArray=""}						
						classOpSignParamArray2D.get(cOpClass).set(i, prepareParameters(featVar, i, varArray.toString))						
					}
					classNomeOperation.addAll(featVar.name.toString)
					cOpClass = cOpClass + 1

				}
			}


			if (EntityPlatform == e.name.toString) {
				// ----------------------Recuperar os códigos específicos. Verificar o tipo de plataforma da entidade no deploy
				for (dep : resource.allContents.toIterable.filter(Deploy)) {
					for (pl : dep.entityToDeploy) {
						if ((pl.ent.name.toString == EntityPlatform) &&
							(NomePlataformaDeclarada == pl.plat.fullyQualifiedName.toString)) { // Pegar o nome da entidade e a plataforma usada para pegar os códigos específicos corretos            	   	
							PlataformaDaEntidade = pl.plat.fullyQualifiedName.toString // Obter a plataforma da entidade
							println("\n Plataforma da entidade: ANDROID >>>>>>>>>>> " + PlataformaDaEntidade)
						}
					}
				}

				for (pe : resource.allContents.toIterable.filter(PlatformDecl)) {
					if (pe.name.toString == PlataformaDaEntidade) { // Verifica qual a plataforma da entidade e tenta pegar os códigos especificados para essa plataforma
						println("\n Plataforma atuamente trabalhando >>>>>>>>>>> " + PlataformaDaEntidade)
						LingDaPlataforma = pe.base.toString

						var countOperationPlat = 0
						for (platformOp : pe.cmdList) {
							if (platformOp instanceof Operation) {
								countOperationPlat++ // Conta o número de operações dentro da declaração de pataforma           	   	               
							}
						}
						OpSignPlatArray2D = new2DString2ArrayOfSize(countOperationPlat, 20)
						OpSignPlatlistNome.clear
						var countOpPlat = 0
						for (platformOp : pe.cmdList) {
							if (platformOp instanceof Operation) {

								OpSignPlatlistNome.addAll(platformOp.name.toString)
								for (i : platformOp.params.size >.. 0) {
									OpSignPlatArray2D.get(countOpPlat).set(i, platformOp.params.get(i).type.compileType + " " +
										platformOp.params.get(i).name)
								}
								countOpPlat = countOpPlat + 1
							}
						}
					}
				}
				//«FOR i : 0..platSeparatedController.size»«IF NomePlataformaDeclarada.equals(platSeparatedController.get(i))»«classGenerationController(resource, fsa, context, contGlobalCall)»«ENDIF»«ENDFOR»
				
				var verifController = 0 
				println(" platSeparatedController 1 " + platSeparatedController.size)
				for (i : 0..< platSeparatedController.size){
					println(" platSeparatedController 2 " + i + " " + platSeparatedController.get(i).toString)					
					if (NomePlataformaDeclarada.equals(platSeparatedController.get(i).toString)){
						if (EntityPlatform.equals(varController)){
						  verifController = 1	
						}
					}
				}
				
				if (verifController.equals(0)){ //Não é controller
					fsa.generateFile(e.fullyQualifiedName.toString("/") + ".cs",
					e.compileEntity(resource, listPlatform, listFeat, classNomeOperation, classOpSignParamArray2D,
						OpSignPlatArray2D, OpSignPlatlistNome, PlataformaDaEntidade, fsa, context))	
										
				}else{ //É controller
				    e.classGenerationController(resource, listPlatform, listFeat, classNomeOperation, classOpSignParamArray2D,
						OpSignPlatArray2D, OpSignPlatlistNome, PlataformaDaEntidade, fsa, context)				
				}
				
			}
		}
	}  
        

        
	def compile(Deploy d) ''' 
	«val listEntity = new ArrayList<String>»«««Recuperando a lista de entidades. Valor
	«val listPlatform = new ArrayList<String>»«««Recuperando a lista de plataformas. Tipo
	public void Deploy{
	«FOR pl : d.entityToDeploy»
	  «listEntity.addAll(pl.ent.name)»«««Add list of entity declared                     
	  «pl.compileDeploy(listPlatform)»«««Cada vez que rodar ele pega uma plataforma e cria a classe           
	«ENDFOR»
	
	}
	'''  
	/*----------------------------------------Recursos Platform--------------------------------------------------*/  
	
	def compileDeploy(Platform plat, ArrayList<String> listEnt)'''          
	Entidade: «plat.ent.name»
	Plataforma: «plat.plat.fullyQualifiedName»
	}
	'''               
	/*----------------------------------------Recursos Platform--------------------------------------------------*/
	
	
	def compileEntity(Entity e, Resource resource, ArrayList<String> listPlat, ArrayList<String> listFeatures,
			ArrayList<String> classNomeOperation, String[][] classOpSignParamArray2D, String[][] OpSignPlatArray2D,
			ArrayList<String> OpSignPlatlistNome, String PlataformaDaEntidade, IFileSystemAccess2 fsa, IGeneratorContext context) '''
	«var Boolean PlatEntity = false /*Aponta se está sendo processado a classe(entidade) ou a */ »
	«IF e.eContainer.fullyQualifiedName !== null»
	   package «e.eContainer.fullyQualifiedName»;
	«ENDIF»
	
	public class «e.name» «IF e.superType !== null» extends «e.superType.fullyQualifiedName» «ENDIF»{
	
	«FOR cmd : e.features»
	  «{PlatEntity = false ""}»
	  «compileEntityCmd(cmd, e, resource, listPlat, listFeatures, classNomeOperation, classOpSignParamArray2D, OpSignPlatArray2D, OpSignPlatlistNome, PlatEntity, PlataformaDaEntidade, fsa, context)»
	«ENDFOR»
	
	«FOR pe : resource.allContents.toIterable.filter(PlatformDecl)»
	 «IF pe.name.toString === PlataformaDaEntidade.toString»   
	   «FOR cmdOpPlat : pe.cmdList»       
	       «{PlatEntity = true ""}»
	       «compilePlatCmd(cmdOpPlat, e, resource, listPlat, listFeatures, classNomeOperation, classOpSignParamArray2D, OpSignPlatArray2D, OpSignPlatlistNome, PlatEntity)»
	   «ENDFOR» 
	 «ENDIF» 
	«ENDFOR»
	}
	'''        
	
	/*----------------------------------------Operation(Métodos)--------------------------------------------------*/
	
	def compileOperation(Operation op, ArrayList<String> classNomeOperation, String[][] classOpSignParamArray2D) '''
			«var countOperation=0»
			«FOR iOp : 0 ..< classNomeOperation.size»
				«{ countOperation++ ""}»
			«ENDFOR» 
			«FOR i : 0 ..< countOperation»
				«IF op.name.toString == classNomeOperation.get(i).toString»   
				«var cpClassOP = 0»
					«FOR cParam : 0 ..< classOpSignParamArray2D.get(i).size»
				       «IF classOpSignParamArray2D.get(i).get(cParam) !== null»«{ cpClassOP++ "" }»«ENDIF»
					«ENDFOR»
					««««Constructor	
					«IF	verifyOpEntName(op).equals(op.name)»		      
				      public «op.name»(«FOR c1 : 0 ..< classOpSignParamArray2D.get(i).size»«IF classOpSignParamArray2D.get(i).get(c1) !== null»«classOpSignParamArray2D.get(i).get(c1).toString»«ENDIF»«IF c1+1 < cpClassOP», «ENDIF»«ENDFOR») {
					««««NormalMethod
					«ELSE»
				      public «prepareParametersReturn(op)»«IF op.genericTypesDecl.size > 0»<«FOR c2 : 0 ..< op.genericTypesDecl.size»«op.genericTypesDecl.get(c2).name.toFirstUpper»«IF c2+1 < op.genericTypesDecl.size», «ENDIF»«ENDFOR»>«ENDIF»«IF !(op.col1 === null)»[]«ENDIF» «op.name»(«FOR c1 : 0 ..< classOpSignParamArray2D.get(i).size»«IF classOpSignParamArray2D.get(i).get(c1) !== null»«classOpSignParamArray2D.get(i).get(c1).toString»«ENDIF»«IF c1+1 < cpClassOP», «ENDIF»«ENDFOR») {
					«ENDIF»
				    «FOR cmdOp : op.cmdList»
				  	  «compileOperationCmd(cmdOp)»
				    «ENDFOR»
				}
				
			«ENDIF»    
			«ENDFOR»
	'''
	
	
	def treatVariableName(String variable){
		if(variable == "img"){
			println(" teste variable : " + variable)
			return "Image"
		}else if (variable == "string"){
			return variable.toFirstUpper
		}else{
			return variable
		}
	}		
	
	

	def prepareParametersReturn(Operation op){	
		var listType = ""
		for (c2 : 0 ..< op.genericTypesDecl.size) {
			listType = listType + op.genericTypesDecl.get(c2).name.toFirstUpper			
		}
		if (listType === "" || op.type.compileType.toString === "void" || op.type.compileType.toString === "Void"){
			//return op.type.compileType
			return treatVariableName(op.type.compileType)
		}else{
			//return op.type.compileType.toFirstUpper
			return treatVariableName(op.type.compileType.toFirstUpper)
		}	
	}	
	
	def verifyOpEntName(Operation op){
		var entityName = ""		
		var parent = op.eContainer							
			if(parent instanceof Entity){				
				entityName = parent.name				
			}		
		return entityName
	}	

    def compileType(DSLTypeRef typeRef) {
    	switch typeRef {
    		//DSLConcreteTypeRef: if (typeRef.ref !== null){ return 'List<' + typeRef.ref.name + '>' }else{ return typeRef.ref.name}
    		DSLConcreteTypeRef:  return typeRef.ref.name 
    		DSLGenericTypeRef: return typeRef.ref.name
    	}
    }	
	
	def compileOperationCmd(CommandOperation cmdOp) {
			//if (cmdOp instanceof AssignmentCmd) {
			//	compileAssignmentCmd(cmdOp);
			//} else 
			if (cmdOp instanceof Attribute) {
				compileFeature(cmdOp)
			} else if (cmdOp instanceof StringTemplateFreeCod) {
				compileStringTemplateFreeCod(cmdOp)
				
            } else if (cmdOp instanceof MethodCallGlobal) {
            	if(cmdOp.call1 !== null){
				   compileMethodCallGlob(cmdOp.call1) 				
				}else if(cmdOp.call2 !== null){
					compileMethodCallOp(cmdOp.call2) 
				}				
				
				
			} else if (cmdOp instanceof AbrevCmd) {
				compileAbrevCmd(cmdOp)
			} else if (cmdOp instanceof MethodCallCmd) {
				compileMethodCallCmd(cmdOp)
	
			//} else if (cmdOp instanceof MethodCallKClassReal) {
			//	compileMethodCallKClassReal(cmdOp)
				
			}else if(cmdOp instanceof CallAttributeObject){
				compileCallAttributeObject(cmdOp)	
	
			} else if (cmdOp instanceof OpLogicoWhile) {
				compileOpLogico(cmdOp)
	
			} else if (cmdOp instanceof OpLogicoDoWhile) {
				compileOpLogicoDoWhile(cmdOp)
	
			} else if (cmdOp instanceof OpLogicoIF) {
				compileOpLogicoIf(cmdOp)
	
			} else if (cmdOp instanceof OpLogicoFor) {
				compileOpLogicoFor(cmdOp)
			} else if (cmdOp instanceof SpecialCommand){
				compileSpecialCommand(cmdOp)
				
			}
	}

/*		
	def compileCallAttributeObject(CallAttributeObject cmd) '''
		    «var varArray=""»
		    «IF(!(cmd.col1===null))»
		     «{varArray="["+ cmd.array + "]" ""}»
		    «ELSE»
		    «varArray=""»
		    «ENDIF»
		    «cmd.left.name»«varArray» = «cmd.e.compileExpr»;
	'''
 */	

	def compileFeature(Attribute cmd) '''
	«IF cmd.arrayAllow.equals(0) && cmd.concreteTypes.size == 0»	 
	     «IF !(cmd.type instanceof Entity)» 
	        «"   "»«treatVariableName(cmd.type.fullyQualifiedName.toString)» «cmd.name»;
	     «ELSE»
	        «"   "»«treatVariableName(cmd.type.fullyQualifiedName.toString)» «cmd.name» = new «cmd.type.fullyQualifiedName»();
	     «ENDIF»
	«ELSEIF !cmd.arrayAllow.equals(0) && cmd.concreteTypes.size == 0»
	        «"   "»«cmd.type.fullyQualifiedName»[] «cmd.name» = new «cmd.type.fullyQualifiedName»[«cmd.arrayAllow»];
	«ELSEIF cmd.concreteTypes.size > 0»
	        «"   "»«cmd.type.name.toFirstUpper»<«countAttributeConcrete(cmd)»> «cmd.name»  = new «cmd.type.name.toFirstUpper»<«countAttributeConcrete(cmd)»>();
	«ENDIF»        
	'''	
	
	
	def countAttributeConcrete(Attribute atr){		
		var attribute = ""
		var comma = ""
		for(c: 0..< atr.concreteTypes.size){
			if(c > 0){
				comma = ', '
			}
			attribute += comma + treatVariableName(atr.concreteTypes.get(c).compileConcreteTypes) 
		}
		return attribute		
	}
	
	
	def compileConcreteTypes(Type t){
		if (t instanceof Attribute){
			return treatVariableName(t.name)
		}else if(t instanceof Entity){
			return t.name
		}else if(t instanceof DataType){
			return t.name
		}
	}
	
	
	
	def adjustTypeLanguage(DataType atr){ //Put the correct type according to the sintaxe of target language 
		if (atr.name.equals("int")){
			return "Integer"
		}else if(atr.name.equals("Int")){
			return "Integer"
		}else if (atr.name.equals("string")) {			
			return "String"
		}else{
			return atr.name			
		}
		
		
	}	
		
	def compileStringTemplateFreeCod(StringTemplateFreeCod opStr) '''
	      «val TamString = (opStr.value.toString.length - 4)»
	      «IF !(opStr.value.toString.equals("[]"))»
           «VelocityGenerator.generateMethodBody(opStr.value.toString.substring(4,TamString))»
	      «ENDIF»        
	'''
	

	
		
	def compileAbrevCmd(AbrevCmd cmd) '''«IF cmd.expr1 !== null»«cmd.expr1.name»«cmd.opIn»«ENDIF»«IF cmd.expr2 !== null && cmd.expr3 !== null»«cmd.expr2.name»«cmd.opIn»«cmd.expr3.compileExpr»«ENDIF»«IF cmd instanceof AssignmentCmdFor»«cmd.left.name»=«cmd.e.compileExpr»«ENDIF»'''			
	    
	def compileMethodCallCmd(MethodCallCmd cmd) '''
	  «"   "»«cmd.obj»«FOR h : 0 ..< cmd.call.size».«dictionaryCSharp(cmd.call.get(h))»«ENDFOR»(«FOR i : 0 ..< cmd.args.size»«cmd.args.get(i).name»«FOR vatr: cmd.args.get(i).VAtr2».«vatr.name»«ENDFOR»«IF cmd.args.size>i+1», «ENDIF»«ENDFOR»);
	'''	
	  
	def compileMethodCallGlob(MethodCallGlob cmd) '''
	  «"   "»«methodCallGlob(cmd)»; 
	 '''	
	 
	def compileMethodCallOp(MethodCallOp cmd)'''
	  «"   "»«methodCallOp(cmd)»;
	''' 
	
	def compileCallAttributeObject(CallAttributeObject cmd)'''
	  «"   "»«cmd.obj.name»«compileVector(cmd.obj.v)»«FOR i : cmd.call.size >.. 0».«cmd.call.get(i).name»«compileVector(cmd.call.get(i).v)»«ENDFOR» = «cmd.e.compileExpr»;
	'''	
		

def compileVector(Vector v){
	var varArray=""
	if(!(v.col1===null)){
		varArray="["+ v.array + "]" ""
	}else{
		varArray=""
	}	
}
		
			    
	//def compileMethodCallKClassReal(MethodCallKClassReal cmd) '''		
	//		«cmd.x» = «cmd.obj.name».«cmd.call.name»(«FOR i : cmd.params.size >.. 0»«cmd.params.get(i).type.compileType + " " + cmd.params.get(i).name»«IF i>0», «ENDIF»«ENDFOR»);
	//'''		
	
	
    def compileSpecialCommand(SpecialCommand cmd)'''
    «IF cmd.command !== null»
    «"   "»«cmd.command»;
	«ELSEIF cmd.attr !== null»
    «"   "»return «cmd.attr.name»;
	«ENDIF»	
    '''		
		
	def compileOpLogico(OpLogicoWhile opCmd) ''' 
		
		«"   "»while («opCmd.e.compileExpLogico()»){
		«FOR cmd2 : opCmd.cmdList»
		«"   "»«"   "»«compileOperationCmd(cmd2)»
		«ENDFOR»
		«"   "»}
		
	'''

	def compileOpLogicoDoWhile(OpLogicoDoWhile opCmd) '''
		
		«"   "»do {
		«FOR cmd2 : opCmd.cmdList»
		«"   "»«"   "»«compileOperationCmd(cmd2)»
		«ENDFOR»
		«"   "»}while(«opCmd.e.compileExpLogico()»);
		
	'''

	def compileOpLogicoIf(OpLogicoIF opCmd) '''
		
		«"   "»if («opCmd.e.compileExpLogico()»){
		«FOR cmd2 : opCmd.cmdList»
		«"   "»«"   "»«compileOperationCmd(cmd2)»
		«ENDFOR»
		«"   "»}«FOR cmdElseIf : opCmd.opElseIf»
				«"   "»else if(«cmdElseIf.expLog.compileExpLogico»){
				«FOR cmd3 : cmdElseIf.cmdList»
				«"   "»«"   "»«compileOperationCmd(cmd3)»
			    «ENDFOR»
				«"   "»}
		«ENDFOR»	
		«FOR cmdElse : opCmd.opElse»
			«"   "»else{
			«FOR cmd3 : cmdElse.cmdList»
			«"   "»«"   "»«compileOperationCmd(cmd3)»
			«ENDFOR»
			«"   "»}
		«ENDFOR»
		
	'''

	def compileOpLogicoFor(OpLogicoFor opCmd) '''
		
		«"   "»for («opCmd.exprLogic.inicio.left.name»=«opCmd.exprLogic.inicio.e.compileExpr»;«opCmd.exprLogic.condicao.compileExpLogico()»;«opCmd.exprLogic.abrevCmd.compileOperationCmd»){
		«FOR cmd2 : opCmd.cmdList»
		«"   "»«"   "»«compileOperationCmd(cmd2)»
		«ENDFOR»
		«"   "»}
		
	'''	


	/*---------------Expressões lógicas-------------- */	
	def compileExpLogico(ExprLogica exprLog) '''«FOR i:0..<exprLog.termos.size»«IF i>0» «exprLog.oplog.get(i-1).compileOpLog» «ENDIF»«exprLog.termos.get(i).compileTermoLogico()»«ENDFOR»'''
	def compileTermoLogico(TermoLogico termoLog) '''«FOR i:0..<termoLog.fatores.size»«IF i>0» «termoLog.oplog.get(i-1).compileOpLog» «ENDIF»«termoLog.fatores.get(i).compileFatorLog()»«ENDFOR»'''
	def compileFatorLog(FatorLogico fatorLog)'''«IF fatorLog.v===null»«IF fatorLog.op1 !== null»«fatorLog.op1»«ELSEIF fatorLog.op2 !== null»«fatorLog.op2»«ELSEIF fatorLog.opRel !== null»«IF fatorLog.expr1.i !=0»«fatorLog.expr1.i»«IF fatorLog.expr1.ID != 0».«fatorLog.expr1.ID»«ENDIF»«ELSEIF fatorLog.expr1.strVar !== null»"«fatorLog.expr1.strVar»"«ELSEIF fatorLog.expr1.VAtr1 !== null»«fatorLog.expr1.VAtr1»«FOR i : 0 ..< fatorLog.expr1.VAtr2.size».«fatorLog.expr1.VAtr2.get(i).name»«ENDFOR»«ELSE»«IF fatorLog.expr1.v === null»«fatorLog.expr1.i»«IF fatorLog.expr1.ID != 0».«fatorLog.expr1.ID»«ENDIF»«ELSE»«fatorLog.expr1.v»«ENDIF»«IF !(fatorLog.expr1.col1===null)»[«fatorLog.expr1.array»]«ENDIF»«ENDIF»«fatorLog.relOperators»«IF fatorLog.expr2.i !=0»«fatorLog.expr2.i»«IF fatorLog.expr2.ID != 0».«fatorLog.expr2.ID»«ENDIF»«ELSEIF fatorLog.expr2.strVar !== null»"«fatorLog.expr2.strVar»"«ELSEIF fatorLog.expr2.VAtr1 !== null»«fatorLog.expr2.VAtr1»«FOR i : 0 ..< fatorLog.expr2.VAtr2.size».«dictionaryCSharp(fatorLog.expr2.VAtr2.get(i).name)»«ENDFOR»«ELSE»«IF fatorLog.expr2.v === null»«fatorLog.expr2.i»«IF fatorLog.expr2.ID != 0».«fatorLog.expr2.ID»«ENDIF»«ELSEIF fatorLog.expr2.strVar !== null»«fatorLog.expr2.strVar»«ELSE»«fatorLog.expr2.v»«ENDIF»«IF !(fatorLog.expr2.col1===null)»[«fatorLog.expr2.array»]«ENDIF»«ENDIF»«ENDIF»«ELSE»«fatorLog.v.name»«ENDIF»«IF fatorLog.opRel === null && fatorLog.op1 === null && fatorLog.op2 === null && fatorLog.v===null»(«compileExpLogico(fatorLog.exprLog)»)«ENDIF»'''
	def compileOpLog(String opL) { return opL}
	/*---------------Expressões lógicas-------------- */




	def dictionaryCSharp(String term){
		if (term == "size"){
			return "Count"
		}else if(term == "get"){
			return "ElementAt"
		}else if(term == "add"){
			return "Add"
		}else{
			return term
		}
	}


    def relOperators(FatorLogico fLog){
    	println(" Saida RelOpe: " + fLog.opRel)
    	if (fLog.opRel.toString.equals('<>')){
    		return "!="
    	}else{
    		return fLog.opRel
    	}    	
    }	

	/*---------------Expressões aritiméticas-------------- */	
	def compileExpr(ExprArit exp) '''«FOR i:0..<exp.termos.size»«IF i>0»«exp.op.get(i-1).compileOp»«ENDIF»«exp.termos.get(i).compileTermo»«ENDFOR»'''	
	def compileTermo(Termo termo) '''«FOR i:0..<termo.fatores.size»«IF i>0»«termo.op.get(i-1).compileOp»«ENDIF»«termo.fatores.get(i).compileFator»«ENDFOR»'''	
	def compileFator(Fator fator) '''«IF fator.v === null && fator.expr===null && fator.strVar === null && fator.VAtr1 === null && fator.mcOperation === null && fator.mcGlobal === null»«fator.d.toString»«ELSE»«IF fator.expr === null && fator.strVar === null && fator.VAtr1 === null && fator.mcOperation === null && fator.mcGlobal === null»«fator.v»«IF !(fator.col1===null)»«IF fator.array2 === null»[«fator.array»]«ELSE»[«fator.array2»]«ENDIF»«ENDIF»«ELSEIF fator.strVar === null && fator.VAtr1 === null && fator.mcOperation === null && fator.mcGlobal === null»(«compileExpr(fator.expr)»)«ELSEIF fator.VAtr1 === null && fator.mcOperation === null && fator.mcGlobal === null»"«fator.strVar»"«ELSEIF fator.VAtr1 !== null && fator.mcOperation === null && fator.mcGlobal === null»«fator.VAtr1.name»«FOR y : 0 ..< fator.VAtr2.size».«dictionaryCSharp(fator.VAtr2.get(y).name)»«IF y < fator.col.size»(«IF fator.value.toString != "[]"»«IF fator.value.get(y).i !=0»«fator.value.get(y).i»«IF fator.value.get(y).ID != 0».«fator.value.get(y).ID»«ENDIF»«ELSEIF fator.value.get(y).VAtr1 !== null»«fator.value.get(y).VAtr1»«FOR z : 0 ..< fator.value.get(y).VAtr2.size».«dictionaryCSharp(fator.value.get(y).VAtr2.get(z).name)»«ENDFOR»«ELSE»«IF fator.value.get(y).v === null»«fator.value.get(y).i»«IF fator.value.get(y).ID != 0».«fator.value.get(y).ID»«ENDIF»«ELSE»«fator.value.get(y).v»«ENDIF»«IF !(fator.value.get(y).col1===null)»[«fator.value.get(y).array»]«ENDIF»«ENDIF»«ENDIF»)«ENDIF»«ENDFOR»«ELSEIF fator.mcGlobal === null»«methodCallOp(fator.mcOperation)»«ELSEIF fator.mcGlobal !== null»«methodCallGlob(fator.mcGlobal)»«ENDIF»«ENDIF»'''
	def compileOp(String op) { return op }
	/*---------------Expressões aritiméticas-------------- */ 

     
   def methodCallGlob(MethodCallGlob mCGlobal)
   '''«IF mCGlobal.obj !== null»«mCGlobal.obj.name.toString».«ENDIF»«mCGlobal.calledOpGlobal.name»(«FOR i : 0 ..< mCGlobal.args.size»«mCGlobal.args.get(i).name»«IF !(mCGlobal.args.get(i).col1===null)»[«mCGlobal.args.get(i).array»]«ENDIF»«IF (i+1)<mCGlobal.args.size», «ENDIF»«ENDFOR»«IF verifyArg(mCGlobal) !== ""»«IF mCGlobal.args.size>0», «ENDIF»«verifyArg(mCGlobal)»«ENDIF»)'''   
   
   def methodCallOp(MethodCallOp mCOp)
   '''«mCOp.call.name»(«FOR i : 0 ..< mCOp.args.size»«mCOp.args.get(i).name»«IF !(mCOp.args.get(i).col1===null)»[«mCOp.args.get(i).array»]«ENDIF»«IF (i+1)<mCOp.args.size», «ENDIF»«ENDFOR»)'''
    
    def verifyArg(MethodCallGlob methodCallGlob){
    	var String entity = "" 
    	var String args = ""      	
    	var int verif=0 
    	val listParamUsesGlobal = new ArrayList<String>
    	listParamUsesGlobal.clear
    	 	
    	entity = verifyEntityName(methodCallGlob)    	
    	var metodoPai = methodCallGlob.eContainer    	
    	//println(" |a-name: " + entity  + " nomeMet: " + methodCallGlob.calledOpGlobal.name + if(methodCallGlob.obj !== null){" obj: " + methodCallGlob.obj.name + " type: " + methodCallGlob.obj.type.name} + "| ")
    	//args+= " |a-name: " + entity  + " "
    	//args+= " |a-name: " + entity  + " nomeMet: " + methodCallGlob.calledOpGlobal.name + if(methodCallGlob.obj !== null){" obj: " + methodCallGlob.obj.name + " type: " + methodCallGlob.obj.type.name} + "| "
	
    	
    	for (ent: res.allContents.toIterable.filter(Entity)){ 
    		//args += " |1-ent resouce " + ent.name + " entVerif" + entity +"| " 
    		if (methodCallGlob.obj !== null){ //If you are using usesGlobal from another entity
    		    if(methodCallGlob.obj.type.name === ent.name){
    		    	//args+=" |04entName " + ent.name + "| "
    		    	for (operat : ent.features){
    		    	   if(operat instanceof OperationGlobCallOld){
    		    	   	  //args+=" |03Operat " + operat.opGlobCall.name + "| "    		    	   	  	
    				      if(operat.opGlobCall.name == methodCallGlob.calledOpGlobal.name){ //find the global method
    				        //println(" |06name " + operat.opGlobCall.name + " ent: " + ent.name + "| ")    				     	
    				        for(p: operat.params) {
    				        	//args+=" |05args " + p.name + "| "	
    				        	listParamUsesGlobal.addAll(p.name)    				     	
    				        }    				     
    				     }    				   	
    				   }    				
    			    }    		    	
    		    }   			
    		}else{   		
    				
    		if(entity.equals(ent.name)){ //If you are using usesGlobal from same entity
    			//args += " |ent " + ent.name + "| "
    			for (operat : ent.features){
    			  //args += " |feat " + operat + "| "	
    			  if(operat instanceof OperationGlobCallOld){    			  	
    			  	//args += " | 1 func ent. : " + operat.opGlobCall.name + " func global: " + methodCallGlob.calledOpGlobal.name + "| "
    				if(operat.opGlobCall.name.equals(methodCallGlob.calledOpGlobal.name)){
    				  //args += " pEnt 1 : " + operat.params.size
    				  for(p: operat.params) {
    				     listParamUsesGlobal.addAll(p.name) 
    				     //args += " pEnt 1" + p.name		
    				  }    				  		  
    				}
    			  }
    		    }    			
    		}
    	   }
    	} 
    	
    	//println("| listParamUsesGlobal.size " + listParamUsesGlobal.size)
    	for(y :0 ..< listParamUsesGlobal.size){
    	  //println("| listParamUsesGlobal.get(y) " + y  + " : " + listParamUsesGlobal.get(y) + " método: " + methodCallGlob.calledOpGlobal.name)	
    	}	

        var int verif2 = 0    	
    	var int countComma = 0 	
        for (plat: res.allContents.toIterable.filter(PlatformDecl)){
        	if (plat.name.toString === platAtual){
        		for (platformOp : plat.cmdList){
        			if(platformOp instanceof OperationGlobal){
        				if (methodCallGlob.calledOpGlobal.name == platformOp.opGlobal.name.toString){
        				  for(z : 0 ..< platformOp.params.size){
        				  	if (platformOp.params.get(z).type instanceof DSLConcreteTypeRef){
        				  	  	verif=0
        				  	  	for(y :0 ..< listParamUsesGlobal.size){
        				  	  		if(platformOp.params.get(z).name.toString.equals(listParamUsesGlobal.get(y).toString)){
        				  	  			verif=1
        				  	  		}
        				  	  	}
        				  	  	    if (verif == 0){
        				  	  	        //args += " |p2 : " + platformOp.params.get(z).name.toString + " list size " + listParamUsesGlobal.size + "| "
        				  	  	        
        				  	  	        verif2 = 0
        				  	  		  	for(q : 0 ..< methodCallGlob.args.size){
        				  	  		  		if (platformOp.params.get(z).name.toString.equals(methodCallGlob.args.get(q).name.toString)){
        				  	  		  			verif2 = 1
        				  	  		  		}
        				  	  		  	}
        				  	  		  	if (verif2 == 0){
        				  	  		       if(countComma == 0){
        				  	  		       	args += platformOp.params.get(z).name.toString
    
        				  	  		      }else{
        				  	  		  	    args += ", " + platformOp.params.get(z).name.toString
        				  	  		      } 
        				  	  		      countComma++       				  	  		    	
        				  	  		    }        				  	  		
        				  	  		}  
        				  	  	
        				  	}        				  	
        				  }	  
        				  
        				}       			
        			}
        		}        		
        	}       	
        }
        return args
    }
    
    
    
    
def verifyEntityName(MethodCallGlob methodCallGlob){
	var String args = "" 
	
	var parent = methodCallGlob.eContainer   	
     	
    	if (parent instanceof Fator){
    		var r1 = parent.eContainer
    		//args += " 1-" + r1.eClass.name //get the name of the rule
    		if (r1 instanceof Termo){
    			var r2 = r1.eContainer
    			//args += " 2-" + r2
    			if (r2 instanceof ExprArit){
    				var r3 = r2.eContainer
    				//args += " 3" + r3 
    				if(r3 instanceof CallAttributeObject) {
    					var r4 = r3.eContainer
    					//args += " 4" + r4
    					if (r4 instanceof CommandFeature){
    						var r5 = r4.eContainer
    						//args += " 5" + r5
    						if (r5 instanceof Entity){
    							//var r6 = r5.eContainer
    							args += r5.name    							
    						}
    					}		  							
    		
    				} else if(r3 instanceof AssignmentCmdFor){
    					var r6 = r3.eContainer
    					if (r6 instanceof OpElse){
    						var r7 = r6.eContainer
    						if (r7 instanceof OpLogicoIF){
    						   var r8 = r7.eContainer
    						   if (r8 instanceof OpLogicoIF){
    						      var r9 = r8.eContainer
    						      //args += " 9 " + r9
    						      if (r9 instanceof OpLogicoFor){
    									var r10 = r9.eContainer
    									//args += " 10 " + r10
    									if (r10 instanceof Operation){
    										var r11 = r10.eContainer
    										//args += " 11 " + r11
    										if (r11 instanceof Entity){
    										   //var cFeat = et.eContainer
    										   args += r11.name    										   
    										}   										
    							 	    }  						   
    						   }
    						}
    					}
    				}  			
    			    } else if(r3 instanceof OpLogicoIF){
    								var r12 = r3.eContainer
    								//args += " 7" + r7
    								if (r12 instanceof CommandOperation){
    									var r13 = r12.eContainer
    									//args += " 8" + r8
    									if (r13 instanceof Operation){
    										var r14 = r13.eContainer
    										//args += " 9" + r9
    										if (r14 instanceof Entity){
    										   //var cFeat = et.eContainer
    										   args += r14.name  										   
    									    }
    									}
    								}    				
    			}
    		  }    			
    	   }    		
    	}
return args	
}
    	
    
	def compileEntityGlob(EntityGlobCall entGlobalCall, String PlataformaDaEntidade, Resource resource)'''
	«FOR plat : resource.allContents.toIterable.filter(PlatformDecl)»	  
	  «IF plat.name.toString === PlataformaDaEntidade» «««Se a plataforma for a mesma que está sendo tratada atualmente: PlataformaDaEntidade	   
	   «FOR platformOp : plat.cmdList»
	    «IF platformOp instanceof EntityGlobal» «««Nome declarado na entidade e a implementação no modelo de plataformas: linha de baixo	     
	     «IF entGlobalCall.opGlobCall.name.toString == platformOp.opGlobal.name.toString» 		
	       «FOR cmd : platformOp.cmdList»
	          	«IF cmd instanceof StringTemplateFreeCod»	          		
				  «compileStringTemplateFreeEntityGlobal(cmd.value.toString, entGlobalCall, platformOp)»
				«ELSE»
				  «compileOperationCmd(cmd)»
				«ENDIF»
	       «ENDFOR»
	       
	     «ENDIF»
	   «ENDIF»
	  «ENDFOR»	 
	 «ENDIF»
	«ENDFOR»
	'''
	
	
	def compileControllerGlob(OperationGlobCall contGlobalCall, String PlataformaDaEntidade, Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context)'''
	«FOR plat : resource.allContents.toIterable.filter(PlatformDecl)»	  
	  «IF plat.name.toString === PlataformaDaEntidade» «««Se a plataforma for a mesma que está sendo tratada atualmente: PlataformaDaEntidade	   
	   «FOR platformOp : plat.cmdList»
	    «IF platformOp instanceof OperationGlobal» «««Nome declarado na entidade e a implementação no modelo de plataformas: linha de baixo	     
	     «IF contGlobalCall.opGlobCall.name.toString == platformOp.opGlobal.name.toString»	       
	       «var int verif = 0»
	       «var int countComma = 0»
	       «var int verifPlat = 0»
	       «FOR j: 0..< platSeparatedController.size»«IF platSeparatedController.get(j).equals(PlataformaDaEntidade)»«{verifPlat = 1 ""}»«ENDIF»«ENDFOR»
	       ««««Caso seja controle na plataforma Web muda o nome do método. O C# pode trabalhar com vários métodos de controle no mesmo arquivo
	       «IF verifPlat.equals(0) && EntityPlatform.equals(varController)» 
	       public «contGlobalCall.typeGlobal.compileType»«IF !(platformOp.col1 === null)»[]«ENDIF» «contGlobalCall.concreteTypes.get(0).name»(«FOR i : 0 ..< contGlobalCall.params.size»«contGlobalCall.params.get(i).type.compileType + " " + contGlobalCall.params.get(i).name»«{countComma = 1 ""}»«IF (i+1)<contGlobalCall.params.size», «ENDIF»«ENDFOR»«FOR z : 0 ..< platformOp.params.size»«IF platformOp.params.get(z).type instanceof DSLConcreteTypeRef»«{verif=0 ""}»«FOR y : 0 ..< contGlobalCall.params.size»«IF platformOp.params.get(z).name.toString.equals(contGlobalCall.params.get(y).name)»«{verif = 1 ""}»«ENDIF»«ENDFOR»«IF verif != 1»«IF countComma > 0 && z >= 1», «ENDIF»«IF platformOp.params.get(z).ref !== null»«platformOp.params.get(z).type.compileType.toFirstUpper»<«platformOp.params.get(z).ref.compileConcreteTypes»> «platformOp.params.get(z).name.toString»«ELSE»«platformOp.params.get(z).type.compileType» «platformOp.params.get(z).name.toString»«ENDIF»«IF z+1<platformOp.params.size», «ENDIF»«ENDIF»«ENDIF»«ENDFOR»){
	       «ELSE»
	       public «contGlobalCall.typeGlobal.compileType»«IF contGlobalCall.genericTypesDecl !== null»<«treatVariableName(contGlobalCall.genericTypesDecl.name)»>«ENDIF»«IF !(platformOp.col1 === null)»[]«ENDIF» «platformOp.opGlobal.name.toString»(«FOR i : 0 ..< contGlobalCall.params.size»«treatVariableName(contGlobalCall.params.get(i).type.compileType) + " " + contGlobalCall.params.get(i).name»«{countComma = 1 ""}»«IF (i+1)<contGlobalCall.params.size», «ENDIF»«ENDFOR»«FOR z : 0 ..< platformOp.params.size»«IF platformOp.params.get(z).type instanceof DSLConcreteTypeRef»«{verif=0 ""}»«FOR y : 0 ..< contGlobalCall.params.size»«IF platformOp.params.get(z).name.toString.equals(contGlobalCall.params.get(y).name)»«{verif = 1 ""}»«ENDIF»«ENDFOR»«IF verif != 1»«IF countComma > 0 && z >= 1», «ENDIF»«IF platformOp.params.get(z).ref !== null»«platformOp.params.get(z).type.compileType.toFirstUpper»<«platformOp.params.get(z).ref.compileConcreteTypes»> «platformOp.params.get(z).name.toString»«ELSE»«platformOp.params.get(z).type.compileType» «platformOp.params.get(z).name.toString»«ENDIF»«IF z+1<platformOp.params.size», «ENDIF»«ENDIF»«ENDIF»«ENDFOR»){
	       «ENDIF»
	       «FOR cmdCont : contGlobalCall.cmdList»«IF cmdCont instanceof StringTemplateFreeCod»«compileStringTemplateFreeCodPlatEntityGlobal(cmdCont.value.toString)»«ELSE»«compileOperationCmd(cmdCont)»«ENDIF»«ENDFOR»	       
	       «FOR cmd : platformOp.cmdList»«IF cmd instanceof StringTemplateFreeCod»«compileStringTemplateFreeCodPlatController(cmd.value.toString, contGlobalCall, platformOp)»«ELSE»«compileOperationCmd(cmd)»«ENDIF»«ENDFOR»
	       }
	       
	     «ENDIF»
	   «ELSEIF platformOp instanceof EntityGlobal»
	     «FOR cmdCont : contGlobalCall.cmdList»
	       «IF cmdCont instanceof EntityGlobCall» «««cmdCont referencia: usesGlobalController do operation  | platformOp.opGlobal referencia: EntityGlobal do modelo de plataforma  
	          «IF platformOp.opGlobal.name == cmdCont.opGlobCall.name»	          
                  «compileEntityGlob(cmdCont, PlataformaDaEntidade, resource)»
	          «ENDIF»	       	       
	       «ENDIF»
	     «ENDFOR» 	        
	   «ENDIF»
	  «ENDFOR»	 
	 «ENDIF»
	«ENDFOR»
	'''
	
	def functionGenerationController(EntityGlobCall entGlobCall) ''' ««« Cria funções customizadas dentro de classes de controle (Controller) 
	 
	'''
	
	def classGenerationController(Entity e, Resource resource, ArrayList<String> listPlat, ArrayList<String> listFeatures,
			ArrayList<String> classNomeOperation, String[][] classOpSignParamArray2D, String[][] OpSignPlatArray2D,
			ArrayList<String> OpSignPlatlistNome, String PlataformaDaEntidade, IFileSystemAccess2 fsa, IGeneratorContext context){
		for (en : resource.allContents.toIterable.filter(Entity)) { // Gerar a entidade de acordo com a EntityPlatform
		   if(EntityPlatform.toString.equals(en.name)){
		   	    //Verificar os métodos dentro da entidade controle
		   	    for(contGlobCall: en.features){
		   	    	if (contGlobCall instanceof OperationGlobCall){
		   	    		fsa.generateFile(e.fullyQualifiedName.toString("/") + compileConcreteTypes(contGlobCall.concreteTypes.get(0)) + ".cs",
					    e.compileEntityController(resource, listPlatform, listFeat, classNomeOperation, classOpSignParamArray2D,
						OpSignPlatArray2D, OpSignPlatlistNome, PlataformaDaEntidade, fsa, context, contGlobCall))
		   	    		
		   	    	}
		   	    }
				
		  }									
		}		
	}
	
	
	def compileEntityController(Entity e, Resource resource, ArrayList<String> listPlat, ArrayList<String> listFeatures, /*Gera as classes distintas para as plataformas móveis. Indicada no platSeparatedController */
			ArrayList<String> classNomeOperation, String[][] classOpSignParamArray2D, String[][] OpSignPlatArray2D,
			ArrayList<String> OpSignPlatlistNome, String PlataformaDaEntidade, IFileSystemAccess2 fsa, IGeneratorContext context, OperationGlobCall contGlobCall) '''
	«var Boolean PlatEntity = false /*Aponta se está sendo processado a classe(entidade) ou a */ »
	«IF e.eContainer.fullyQualifiedName !== null»
	   package «e.eContainer.fullyQualifiedName»;
	«ENDIF»
	
	
	public class «e.name»«compileConcreteTypes(contGlobCall.concreteTypes.get(0))»Fragment «IF e.superType !== null» extends «e.superType.fullyQualifiedName» «ENDIF»{
	
	«FOR cmd : e.features»
	  «{PlatEntity = false ""}»
	  «/*Verficar se o nome da classe tem o mesmo tipo do usesGlobalController*/ »
	  «IF cmd instanceof OperationGlobCall»
	     «IF compileConcreteTypes(contGlobCall.concreteTypes.get(0)).equals(compileConcreteTypes(cmd.concreteTypes.get(0)))»
	       «compileEntityCmd(cmd, e, resource, listPlat, listFeatures, classNomeOperation, classOpSignParamArray2D, OpSignPlatArray2D, OpSignPlatlistNome, PlatEntity, PlataformaDaEntidade, fsa, context)»
	     «ENDIF»
	  «ELSE»
	  	  «compileEntityCmd(cmd, e, resource, listPlat, listFeatures, classNomeOperation, classOpSignParamArray2D, OpSignPlatArray2D, OpSignPlatlistNome, PlatEntity, PlataformaDaEntidade, fsa, context)»
	  «ENDIF»
	«ENDFOR»
	
	«FOR pe : resource.allContents.toIterable.filter(PlatformDecl)»
	 «IF pe.name.toString === PlataformaDaEntidade.toString»   
	   «FOR cmdOpPlat : pe.cmdList»       
	       «{PlatEntity = true ""}»
	       «compilePlatCmd(cmdOpPlat, e, resource, listPlat, listFeatures, classNomeOperation, classOpSignParamArray2D, OpSignPlatArray2D, OpSignPlatlistNome, PlatEntity)»
	   «ENDFOR» 
	 «ENDIF» 
	«ENDFOR»
	}
	'''   	
	
	
	def compileOperationGlob(OperationGlobCallOld opGlobalEnt, String PlataformaDaEntidade, Resource resource)'''	
	«FOR plat : resource.allContents.toIterable.filter(PlatformDecl)»
	  «IF plat.name.toString === PlataformaDaEntidade» «««Se a plataforma for a mesma que está sendo tratada atualmente: PlataformaDaEntidade
	   «FOR platformOp : plat.cmdList»
	    «IF platformOp instanceof OperationGlobal» «««Nome declarado na entidade e a implementação no modelo de plataformas: linha de baixo
	     «IF opGlobalEnt.opGlobCall.name.toString.toString == platformOp.opGlobal.name.toString»
	       «var int verif = 0»
	       «var int countComma = 0»
	       public «opGlobalEnt.typeGlobal.compileType»«IF opGlobalEnt.genericTypesDecl !== null»<«opGlobalEnt.genericTypesDecl.name»>«ENDIF»«IF !(opGlobalEnt.col1 === null)»[]«ENDIF» «opGlobalEnt.opGlobCall.name.toString»(«FOR i : 0 ..< opGlobalEnt.params.size»«opGlobalEnt.params.get(i).type.compileType + " " + opGlobalEnt.params.get(i).name»«{countComma = 1 ""}»«IF (i+1)<opGlobalEnt.params.size», «ENDIF»«ENDFOR»«FOR z : 0 ..< platformOp.params.size»«IF platformOp.params.get(z).type instanceof DSLConcreteTypeRef»«{verif=0 ""}»«FOR y : 0 ..< opGlobalEnt.params.size»«IF platformOp.params.get(z).name.toString.equals(opGlobalEnt.params.get(y).name)»«{verif = 1 ""}»«ENDIF»«ENDFOR»«IF verif != 1»«IF countComma > 0 && z >= 1», «ENDIF»«IF platformOp.params.get(z).ref !== null»«platformOp.params.get(z).type.compileType.toFirstUpper»<«platformOp.params.get(z).ref.compileConcreteTypes»> «platformOp.params.get(z).name.toString»«ELSE»«platformOp.params.get(z).type.compileType» «platformOp.params.get(z).name.toString»«ENDIF»«IF z+1<platformOp.params.size», «ENDIF»«ENDIF»«ENDIF»«ENDFOR»){
	       «FOR cmd : platformOp.cmdList»
	          	«IF cmd instanceof StringTemplateFreeCod»	          		
				  «compileStringTemplateFreeCodPlat(cmd.value.toString, opGlobalEnt, platformOp)»
				«ELSE»
				  «compileOperationCmd(cmd)»
				«ENDIF»     
	       «ENDFOR»
	       }
	       
	     «ENDIF»
	   «ENDIF»
	  «ENDFOR»	 
	 «ENDIF»
	«ENDFOR»
	'''
	
	def compileStringTemplateFreeCodPlat(String opStr, OperationGlobCallOld opGCall, OperationGlobal opGlobal) '''
	        «val TamString = opStr.toString.length - 4»
	        «IF !(opStr.toString.equals("[]"))»
              «VelocityGenerator.generateMethodBody(opGCall, opGlobal, opStr.toString.substring(4,TamString))»
            «ENDIF»            
	'''
	
	
	def compileStringTemplateFreeCodPlatController(String opStr, OperationGlobCall opGCall, OperationGlobal opGlobal) '''
	        «val TamString = opStr.toString.length - 4»
	        «IF !(opStr.toString.equals("[]"))»
              «VelocityGenerator.generateMethodBodyController(opGCall, opGlobal, opStr.toString.substring(4,TamString))»
            «ENDIF»            
	'''	
	
	def compileStringTemplateFreeCodPlatEntityGlobal(String opStr) '''
	        «val TamString = opStr.toString.length - 4»
	        «IF !(opStr.toString.equals("[]"))»
              «VelocityGenerator.generateMethodBodyEntityGlobal(opStr.toString.substring(4,TamString))»
            «ENDIF»            
	'''	
	
	def compileStringTemplateFreeEntityGlobal(String opStr, EntityGlobCall entGCall, EntityGlobal entGlobal)'''
	        «val TamString = opStr.toString.length - 4»
	        «IF !(opStr.toString.equals("[]"))»
              «VelocityGenerator.generateMethodBodyEntity(entGCall, entGlobal, opStr.toString.substring(4,TamString))»
            «ENDIF»   	
	'''	
	

		

	def compile(Attribute f) '''
	«IF f.arrayAllow.equals(0) && f.concreteTypes.size == 0»
		«" "»private «treatVariableName(f.type.fullyQualifiedName.toString)» «f.name»;
	«ELSEIF !f.arrayAllow.equals(0) && f.concreteTypes.size == 0»
		«" "»private «f.type.fullyQualifiedName»[] «f.name» = new «f.type.fullyQualifiedName»[«f.arrayAllow»];
	«ELSEIF f.concreteTypes.size > 0»
		 «" "»private «f.type.name»<«countAttributeConcrete(f)»> «f.name»;
	«ENDIF»

    «IF f.concreteTypes.size == 0»
	«" "»public «treatVariableName(f.type.fullyQualifiedName.toString)»«IF !f.arrayAllow.equals(0)»[]«ENDIF» get«f.name.toFirstUpper»() {
	«" "»«" "»return «f.name»;
	«" "»}
	
	«" "»public void set«f.name.toFirstUpper»(«treatVariableName(f.type.fullyQualifiedName.toString)»«IF !f.arrayAllow.equals(0)»[]«ENDIF» «f.name») {
	«" "»«" "»this.«f.name» = «f.name»;
	«" "»}
	«ENDIF»
	'''
	
	
}