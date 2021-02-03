/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform.impl;

import br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage;
import br.dslcross.crossplatform.crossPlatform.DSLTypeRef;
import br.dslcross.crossplatform.crossPlatform.Parameter;
import br.dslcross.crossplatform.crossPlatform.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.ParameterImpl#getCol1 <em>Col1</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.ParameterImpl#getArray <em>Array</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.ParameterImpl#getCol2 <em>Col2</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.ParameterImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DSLTypeRef type;

  /**
   * The default value of the '{@link #getCol1() <em>Col1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCol1()
   * @generated
   * @ordered
   */
  protected static final String COL1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCol1() <em>Col1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCol1()
   * @generated
   * @ordered
   */
  protected String col1 = COL1_EDEFAULT;

  /**
   * The default value of the '{@link #getArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected static final int ARRAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected int array = ARRAY_EDEFAULT;

  /**
   * The default value of the '{@link #getCol2() <em>Col2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCol2()
   * @generated
   * @ordered
   */
  protected static final String COL2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCol2() <em>Col2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCol2()
   * @generated
   * @ordered
   */
  protected String col2 = COL2_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Type ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return CrossPlatformPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLTypeRef getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DSLTypeRef newType, NotificationChain msgs)
  {
    DSLTypeRef oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.PARAMETER__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(DSLTypeRef newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.PARAMETER__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.PARAMETER__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.PARAMETER__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCol1()
  {
    return col1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCol1(String newCol1)
  {
    String oldCol1 = col1;
    col1 = newCol1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.PARAMETER__COL1, oldCol1, col1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArray(int newArray)
  {
    int oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.PARAMETER__ARRAY, oldArray, array));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCol2()
  {
    return col2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCol2(String newCol2)
  {
    String oldCol2 = col2;
    col2 = newCol2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.PARAMETER__COL2, oldCol2, col2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (Type)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrossPlatformPackage.PARAMETER__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(Type newRef)
  {
    Type oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.PARAMETER__REF, oldRef, ref));
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
      case CrossPlatformPackage.PARAMETER__TYPE:
        return basicSetType(null, msgs);
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
      case CrossPlatformPackage.PARAMETER__NAME:
        return getName();
      case CrossPlatformPackage.PARAMETER__TYPE:
        return getType();
      case CrossPlatformPackage.PARAMETER__COL1:
        return getCol1();
      case CrossPlatformPackage.PARAMETER__ARRAY:
        return getArray();
      case CrossPlatformPackage.PARAMETER__COL2:
        return getCol2();
      case CrossPlatformPackage.PARAMETER__REF:
        if (resolve) return getRef();
        return basicGetRef();
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
      case CrossPlatformPackage.PARAMETER__NAME:
        setName((String)newValue);
        return;
      case CrossPlatformPackage.PARAMETER__TYPE:
        setType((DSLTypeRef)newValue);
        return;
      case CrossPlatformPackage.PARAMETER__COL1:
        setCol1((String)newValue);
        return;
      case CrossPlatformPackage.PARAMETER__ARRAY:
        setArray((Integer)newValue);
        return;
      case CrossPlatformPackage.PARAMETER__COL2:
        setCol2((String)newValue);
        return;
      case CrossPlatformPackage.PARAMETER__REF:
        setRef((Type)newValue);
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
      case CrossPlatformPackage.PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CrossPlatformPackage.PARAMETER__TYPE:
        setType((DSLTypeRef)null);
        return;
      case CrossPlatformPackage.PARAMETER__COL1:
        setCol1(COL1_EDEFAULT);
        return;
      case CrossPlatformPackage.PARAMETER__ARRAY:
        setArray(ARRAY_EDEFAULT);
        return;
      case CrossPlatformPackage.PARAMETER__COL2:
        setCol2(COL2_EDEFAULT);
        return;
      case CrossPlatformPackage.PARAMETER__REF:
        setRef((Type)null);
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
      case CrossPlatformPackage.PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CrossPlatformPackage.PARAMETER__TYPE:
        return type != null;
      case CrossPlatformPackage.PARAMETER__COL1:
        return COL1_EDEFAULT == null ? col1 != null : !COL1_EDEFAULT.equals(col1);
      case CrossPlatformPackage.PARAMETER__ARRAY:
        return array != ARRAY_EDEFAULT;
      case CrossPlatformPackage.PARAMETER__COL2:
        return COL2_EDEFAULT == null ? col2 != null : !COL2_EDEFAULT.equals(col2);
      case CrossPlatformPackage.PARAMETER__REF:
        return ref != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", col1: ");
    result.append(col1);
    result.append(", array: ");
    result.append(array);
    result.append(", col2: ");
    result.append(col2);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl