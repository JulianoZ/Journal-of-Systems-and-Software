/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Parameter#getCol1 <em>Col1</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Parameter#getArray <em>Array</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Parameter#getCol2 <em>Col2</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.Parameter#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DSLTypeRef)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  DSLTypeRef getType();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DSLTypeRef value);

  /**
   * Returns the value of the '<em><b>Col1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col1</em>' attribute.
   * @see #setCol1(String)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getParameter_Col1()
   * @model
   * @generated
   */
  String getCol1();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.Parameter#getCol1 <em>Col1</em>}' attribute.
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
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getParameter_Array()
   * @model
   * @generated
   */
  int getArray();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.Parameter#getArray <em>Array</em>}' attribute.
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
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getParameter_Col2()
   * @model
   * @generated
   */
  String getCol2();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.Parameter#getCol2 <em>Col2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col2</em>' attribute.
   * @see #getCol2()
   * @generated
   */
  void setCol2(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Type)
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getParameter_Ref()
   * @model
   * @generated
   */
  Type getRef();

  /**
   * Sets the value of the '{@link br.dslcross.crossplatform.crossPlatform.Parameter#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Type value);

} // Parameter