/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Glob Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getConcreteTypes <em>Concrete Types</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getParamList <em>Param List</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getOpGlobCall <em>Op Glob Call</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getParams <em>Params</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getTypeGlobal <em>Type Global</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getGenericTypesDecl <em>Generic Types Decl</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getCol1 <em>Col1</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getArray <em>Array</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getCol2 <em>Col2</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getCmdList <em>Cmd List</em>}</li>
 * </ul>
 *
 * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall()
 * @model
 * @generated
 */
public interface OperationGlobCall extends CommandFeature
{
  /**
   * Returns the value of the '<em><b>Concrete Types</b></em>' reference list.
   * The list contents are of type {@link br.dslcross.crossplatform.crossPlatform.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Types</em>' reference list.
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_ConcreteTypes()
   * @model
   * @generated
   */
  EList<Type> getConcreteTypes();

  /**
   * Returns the value of the '<em><b>Param List</b></em>' containment reference list.
   * The list contents are of type {@link br.dslcross.crossplatform.crossPlatform.ParamList}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param List</em>' containment reference list.
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_ParamList()
   * @model containment="true"
   * @generated
   */
  EList<ParamList> getParamList();

  /**
   * Returns the value of the '<em><b>Op Glob Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Glob Call</em>' reference.
   * @see #setOpGlobCall(Global)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_OpGlobCall()
   * @model
   * @generated
   */
  Global getOpGlobCall();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getOpGlobCall <em>Op Glob Call</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Glob Call</em>' reference.
   * @see #getOpGlobCall()
   * @generated
   */
  void setOpGlobCall(Global value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link br.dslcross.crossplatform.crossPlatform.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Type Global</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Global</em>' containment reference.
   * @see #setTypeGlobal(DSLTypeRef)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_TypeGlobal()
   * @model containment="true"
   * @generated
   */
  DSLTypeRef getTypeGlobal();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getTypeGlobal <em>Type Global</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Global</em>' containment reference.
   * @see #getTypeGlobal()
   * @generated
   */
  void setTypeGlobal(DSLTypeRef value);

  /**
   * Returns the value of the '<em><b>Generic Types Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Types Decl</em>' reference.
   * @see #setGenericTypesDecl(Type)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_GenericTypesDecl()
   * @model
   * @generated
   */
  Type getGenericTypesDecl();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getGenericTypesDecl <em>Generic Types Decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Types Decl</em>' reference.
   * @see #getGenericTypesDecl()
   * @generated
   */
  void setGenericTypesDecl(Type value);

  /**
   * Returns the value of the '<em><b>Col1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col1</em>' attribute.
   * @see #setCol1(String)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_Col1()
   * @model
   * @generated
   */
  String getCol1();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getCol1 <em>Col1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col1</em>' attribute.
   * @see #getCol1()
   * @generated
   */
  void setCol1(String value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(int)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_Array()
   * @model
   * @generated
   */
  int getArray();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #getArray()
   * @generated
   */
  void setArray(int value);

  /**
   * Returns the value of the '<em><b>Col2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col2</em>' attribute.
   * @see #setCol2(String)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_Col2()
   * @model
   * @generated
   */
  String getCol2();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.OperationGlobCall#getCol2 <em>Col2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col2</em>' attribute.
   * @see #getCol2()
   * @generated
   */
  void setCol2(String value);

  /**
   * Returns the value of the '<em><b>Cmd List</b></em>' containment reference list.
   * The list contents are of type {@link br.dslcross.crossplatform.crossPlatform.CommandOperation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd List</em>' containment reference list.
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getOperationGlobCall_CmdList()
   * @model containment="true"
   * @generated
   */
  EList<CommandOperation> getCmdList();

} // OperationGlobCall
