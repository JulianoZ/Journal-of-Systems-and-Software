package br.dslcross.crossplatform.generator;

import java.io.StringWriter;
import java.util.HashMap;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;


import br.dslcross.crossplatform.crossPlatform.OperationGlobal;
import br.dslcross.crossplatform.crossPlatform.OperationGlobCallOld;
import br.dslcross.crossplatform.crossPlatform.Type;
import br.dslcross.crossplatform.crossPlatform.Parameter;
import br.dslcross.crossplatform.crossPlatform.OperationGlobCall;
import br.dslcross.crossplatform.crossPlatform.OperationGlobal;
import br.dslcross.crossplatform.crossPlatform.DSLGenericType;
import br.dslcross.crossplatform.crossPlatform.DSLGenericTypeRef;
import br.dslcross.crossplatform.crossPlatform.EntityGlobCall;
import br.dslcross.crossplatform.crossPlatform.EntityGlobal;




public class VelocityGenerator {
	public static String generateMethodBody(String methodBody) {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(
		    VelocityEngine.RUNTIME_LOG_NAME, "mylog");
		ve.init();

		VelocityContext context = new VelocityContext();
		
		StringWriter sw = new StringWriter();
		
		System.out.print(" methodBody " + methodBody);
		
		ve.evaluate(context, sw, "velocityGenerator", methodBody);

		return sw.toString();
	}
	


	public static boolean verifyNumber(String varNumber1, String varNumber2) { //verify if a for express is a number or string to make the correct for to swift generator 
		boolean result = true;
		
		float v1, v2;		
		try
        { 
            // checking valid float using parseInt() method            
            v1 = Float.parseFloat(varNumber1);
            System.out.println(varNumber1 + " is a valid float number"); 
            
            v2 = Float.parseFloat(varNumber2);
            System.out.println(varNumber2 + " is a valid float number"); 
            
            result = true;
        }  
        catch (NumberFormatException e) 
        { 
            System.out.println(varNumber1 + " is not a valid float number"); 
            result = false;
        } 
		

		return result;		
	}
	
	public static String generateMethodBody(OperationGlobCallOld gmu, OperationGlobal gmi, String methodBody) {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(
		    VelocityEngine.RUNTIME_LOG_NAME, "mylog");
		ve.init();

		VelocityContext context = new VelocityContext();

		int concreteTypesSize = gmu.getConcreteTypes().size();		
		//HashMap<String,Type> typeConcretizationMap = new HashMap<String,Type>();

		for (int i = 0; i < concreteTypesSize; i++) {
			Type concreteTypeGmu = (Type) gmu.getConcreteTypes().get(i);			
			DSLGenericType genericTypeGms = gmi.getGenericTypes().get(i);
			//typeConcretizationMap.put(genericTypeGms.getName(), concreteTypeGmu);
			VelocityType vt = new VelocityType(concreteTypeGmu);
			context.put(genericTypeGms.getName(), vt);
		}
		
//		for(Parameter param: gmi.getParams()) {
//			if(param.getType() instanceof DSLGenericTypeRef) {
//				DSLGenericTypeRef gtr = (DSLGenericTypeRef)param.getType();
//				Type t = typeConcretizationMap.get(gtr.getRef().getName());
//				VelocityType vt = new VelocityType(t);
//				context.put(param.getName(), vt);
//			}
//		}
		
		StringWriter sw = new StringWriter();
		
		//System.out.println(" methodBody " + methodBody);
		
		ve.evaluate(context, sw, "velocityGenerator", methodBody);


		return sw.toString();
	}
	
	
	public static String generateMethodBodyController(OperationGlobCall gmu, OperationGlobal gmi, String methodBody) {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(
		    VelocityEngine.RUNTIME_LOG_NAME, "mylog");
		ve.init();

		VelocityContext context = new VelocityContext();

		int concreteTypesSize = gmu.getConcreteTypes().size();		
		//HashMap<String,Type> typeConcretizationMap = new HashMap<String,Type>();

		for (int i = 0; i < concreteTypesSize; i++) {
			Type concreteTypeGmu = (Type) gmu.getConcreteTypes().get(i);			
			DSLGenericType genericTypeGms = gmi.getGenericTypes().get(i);
			//typeConcretizationMap.put(genericTypeGms.getName(), concreteTypeGmu);
			VelocityType vt = new VelocityType(concreteTypeGmu);
			context.put(genericTypeGms.getName(), vt);
		}		

		
		StringWriter sw = new StringWriter();		
		ve.evaluate(context, sw, "velocityGenerator", methodBody);

		return sw.toString();
	}	
	
	
	
	
	
	public static String generateMethodBodyEntity(EntityGlobCall gmu, EntityGlobal gmi, String methodBody) {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(
		    VelocityEngine.RUNTIME_LOG_NAME, "mylog");
		ve.init();

		VelocityContext context = new VelocityContext();

		int concreteTypesSize = gmu.getConcreteTypes().size();		

		for (int i = 0; i < concreteTypesSize; i++) {
			Type concreteTypeGmu = (Type) gmu.getConcreteTypes().get(i);			
			DSLGenericType genericTypeGms = gmi.getGenericTypes().get(i);			
			VelocityType vt = new VelocityType(concreteTypeGmu);
			context.put(genericTypeGms.getName(), vt);
		}		
		StringWriter sw = new StringWriter();		
		ve.evaluate(context, sw, "velocityGenerator", methodBody);
		return sw.toString();
	}	
	
	
	
	
	
	public static String generateMethodBodyEntityGlobal(String methodBody) {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(
		    VelocityEngine.RUNTIME_LOG_NAME, "mylog");
		ve.init();
		VelocityContext context = new VelocityContext();		
		StringWriter sw = new StringWriter();		
		ve.evaluate(context, sw, "velocityGenerator", methodBody);
		return sw.toString();
	}
	

}


