/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termo Logico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.TermoLogico#getFatores <em>Fatores</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.TermoLogico#getOplog <em>Oplog</em>}</li>
 * </ul>
 *
 * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getTermoLogico()
 * @model
 * @generated
 */
public interface TermoLogico extends EObject
{
  /**
   * Returns the value of the '<em><b>Fatores</b></em>' containment reference list.
   * The list contents are of type {@link br.dslcross.crossplatform.crossPlatform.FatorLogico}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fatores</em>' containment reference list.
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getTermoLogico_Fatores()
   * @model containment="true"
   * @generated
   */
  EList<FatorLogico> getFatores();

  /**
   * Returns the value of the '<em><b>Oplog</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oplog</em>' attribute list.
   * @see br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage#getTermoLogico_Oplog()
   * @model unique="false"
   * @generated
   */
  EList<String> getOplog();

} // TermoLogico
