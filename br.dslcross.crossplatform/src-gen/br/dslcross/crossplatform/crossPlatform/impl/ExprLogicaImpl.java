/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform.impl;

import br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage;
import br.dslcross.crossplatform.crossPlatform.ExprLogica;
import br.dslcross.crossplatform.crossPlatform.TermoLogico;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Logica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.ExprLogicaImpl#getTermos <em>Termos</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.ExprLogicaImpl#getOplog <em>Oplog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprLogicaImpl extends MinimalEObjectImpl.Container implements ExprLogica
{
  /**
   * The cached value of the '{@link #getTermos() <em>Termos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermos()
   * @generated
   * @ordered
   */
  protected EList<TermoLogico> termos;

  /**
   * The cached value of the '{@link #getOplog() <em>Oplog</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOplog()
   * @generated
   * @ordered
   */
  protected EList<String> oplog;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprLogicaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CrossPlatformPackage.Literals.EXPR_LOGICA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TermoLogico> getTermos()
  {
    if (termos == null)
    {
      termos = new EObjectContainmentEList<TermoLogico>(TermoLogico.class, this, CrossPlatformPackage.EXPR_LOGICA__TERMOS);
    }
    return termos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getOplog()
  {
    if (oplog == null)
    {
      oplog = new EDataTypeEList<String>(String.class, this, CrossPlatformPackage.EXPR_LOGICA__OPLOG);
    }
    return oplog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CrossPlatformPackage.EXPR_LOGICA__TERMOS:
        return ((InternalEList<?>)getTermos()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CrossPlatformPackage.EXPR_LOGICA__TERMOS:
        return getTermos();
      case CrossPlatformPackage.EXPR_LOGICA__OPLOG:
        return getOplog();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CrossPlatformPackage.EXPR_LOGICA__TERMOS:
        getTermos().clear();
        getTermos().addAll((Collection<? extends TermoLogico>)newValue);
        return;
      case CrossPlatformPackage.EXPR_LOGICA__OPLOG:
        getOplog().clear();
        getOplog().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CrossPlatformPackage.EXPR_LOGICA__TERMOS:
        getTermos().clear();
        return;
      case CrossPlatformPackage.EXPR_LOGICA__OPLOG:
        getOplog().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CrossPlatformPackage.EXPR_LOGICA__TERMOS:
        return termos != null && !termos.isEmpty();
      case CrossPlatformPackage.EXPR_LOGICA__OPLOG:
        return oplog != null && !oplog.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (oplog: ");
    result.append(oplog);
    result.append(')');
    return result.toString();
  }

} //ExprLogicaImpl
