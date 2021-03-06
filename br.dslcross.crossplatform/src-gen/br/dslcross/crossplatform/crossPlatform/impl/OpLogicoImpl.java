/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform.impl;

import br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage;
import br.dslcross.crossplatform.crossPlatform.OpLogico;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Logico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OpLogicoImpl#getOp1 <em>Op1</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OpLogicoImpl#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpLogicoImpl extends MinimalEObjectImpl.Container implements OpLogico
{
  /**
   * The default value of the '{@link #getOp1() <em>Op1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp1()
   * @generated
   * @ordered
   */
  protected static final String OP1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp1() <em>Op1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp1()
   * @generated
   * @ordered
   */
  protected String op1 = OP1_EDEFAULT;

  /**
   * The default value of the '{@link #getOp2() <em>Op2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected static final String OP2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp2() <em>Op2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected String op2 = OP2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpLogicoImpl()
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
    return CrossPlatformPackage.Literals.OP_LOGICO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp1()
  {
    return op1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp1(String newOp1)
  {
    String oldOp1 = op1;
    op1 = newOp1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OP_LOGICO__OP1, oldOp1, op1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp2()
  {
    return op2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp2(String newOp2)
  {
    String oldOp2 = op2;
    op2 = newOp2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OP_LOGICO__OP2, oldOp2, op2));
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
      case CrossPlatformPackage.OP_LOGICO__OP1:
        return getOp1();
      case CrossPlatformPackage.OP_LOGICO__OP2:
        return getOp2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CrossPlatformPackage.OP_LOGICO__OP1:
        setOp1((String)newValue);
        return;
      case CrossPlatformPackage.OP_LOGICO__OP2:
        setOp2((String)newValue);
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
      case CrossPlatformPackage.OP_LOGICO__OP1:
        setOp1(OP1_EDEFAULT);
        return;
      case CrossPlatformPackage.OP_LOGICO__OP2:
        setOp2(OP2_EDEFAULT);
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
      case CrossPlatformPackage.OP_LOGICO__OP1:
        return OP1_EDEFAULT == null ? op1 != null : !OP1_EDEFAULT.equals(op1);
      case CrossPlatformPackage.OP_LOGICO__OP2:
        return OP2_EDEFAULT == null ? op2 != null : !OP2_EDEFAULT.equals(op2);
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
    result.append(" (op1: ");
    result.append(op1);
    result.append(", op2: ");
    result.append(op2);
    result.append(')');
    return result.toString();
  }

} //OpLogicoImpl
