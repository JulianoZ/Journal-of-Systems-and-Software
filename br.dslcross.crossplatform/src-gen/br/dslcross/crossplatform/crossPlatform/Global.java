/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Global#getGenericTypes <em>Generic Types</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Global#getParams <em>Params</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Global#getType <em>Type</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Global#getGenericTypesDecl <em>Generic Types Decl</em>}</li>
 * </ul>
 *
 * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getGlobal()
 * @model
 * @generated
 */
public interface Global extends Type
{
  /**
   * Returns the value of the '<em><b>Generic Types</b></em>' containment reference list.
   * The list contents are of type {@link br.dslcross.crossplatform.crossPlatform.DSLGenericType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Types</em>' containment reference list.
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getGlobal_GenericTypes()
   * @model containment="true"
   * @generated
   */
  EList<DSLGenericType> getGenericTypes();

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link br.dslcross.crossplatform.crossPlatform.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getGlobal_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DSLTypeRef)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getGlobal_Type()
   * @model containment="true"
   * @generated
   */
  DSLTypeRef getType();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.Global#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DSLTypeRef value);

  /**
   * Returns the value of the '<em><b>Generic Types Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Types Decl</em>' containment reference.
   * @see #setGenericTypesDecl(DSLGenericType)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getGlobal_GenericTypesDecl()
   * @model containment="true"
   * @generated
   */
  DSLGenericType getGenericTypesDecl();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.Global#getGenericTypesDecl <em>Generic Types Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Types Decl</em>' containment reference.
   * @see #getGenericTypesDecl()
   * @generated
   */
  void setGenericTypesDecl(DSLGenericType value);

} // Global
