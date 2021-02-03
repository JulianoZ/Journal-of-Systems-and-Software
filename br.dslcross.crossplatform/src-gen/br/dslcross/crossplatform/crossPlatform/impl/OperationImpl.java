/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform.impl;

import br.dslcross.crossplatform.crossPlatform.CommandOperation;
import br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage;
import br.dslcross.crossplatform.crossPlatform.DSLTypeRef;
import br.dslcross.crossplatform.crossPlatform.ExprArit;
import br.dslcross.crossplatform.crossPlatform.Operation;
import br.dslcross.crossplatform.crossPlatform.Parameter;
import br.dslcross.crossplatform.crossPlatform.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getParamExtra <em>Param Extra</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getGenericTypesDecl <em>Generic Types Decl</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getCol1 <em>Col1</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getArray <em>Array</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getCol2 <em>Col2</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationImpl#getCmdList <em>Cmd List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends CommandFeatureImpl implements Operation
{
  /**
   * The cached value of the '{@link #getParamExtra() <em>Param Extra</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamExtra()
   * @generated
   * @ordered
   */
  protected ExprArit paramExtra;

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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

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
   * The cached value of the '{@link #getGenericTypesDecl() <em>Generic Types Decl</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericTypesDecl()
   * @generated
   * @ordered
   */
  protected EList<Type> genericTypesDecl;

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
   * The cached value of the '{@link #getCmdList() <em>Cmd List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdList()
   * @generated
   * @ordered
   */
  protected EList<CommandOperation> cmdList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return CrossPlatformPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprArit getParamExtra()
  {
    return paramExtra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamExtra(ExprArit newParamExtra, NotificationChain msgs)
  {
    ExprArit oldParamExtra = paramExtra;
    paramExtra = newParamExtra;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION__PARAM_EXTRA, oldParamExtra, newParamExtra);
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
  public void setParamExtra(ExprArit newParamExtra)
  {
    if (newParamExtra != paramExtra)
    {
      NotificationChain msgs = null;
      if (paramExtra != null)
        msgs = ((InternalEObject)paramExtra).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.OPERATION__PARAM_EXTRA, null, msgs);
      if (newParamExtra != null)
        msgs = ((InternalEObject)newParamExtra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.OPERATION__PARAM_EXTRA, null, msgs);
      msgs = basicSetParamExtra(newParamExtra, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION__PARAM_EXTRA, newParamExtra, newParamExtra));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, CrossPlatformPackage.OPERATION__PARAMS);
    }
    return params;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.OPERATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.OPERATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Type> getGenericTypesDecl()
  {
    if (genericTypesDecl == null)
    {
      genericTypesDecl = new EObjectResolvingEList<Type>(Type.class, this, CrossPlatformPackage.OPERATION__GENERIC_TYPES_DECL);
    }
    return genericTypesDecl;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION__COL1, oldCol1, col1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION__ARRAY, oldArray, array));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION__COL2, oldCol2, col2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CommandOperation> getCmdList()
  {
    if (cmdList == null)
    {
      cmdList = new EObjectContainmentEList<CommandOperation>(CommandOperation.class, this, CrossPlatformPackage.OPERATION__CMD_LIST);
    }
    return cmdList;
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
      case CrossPlatformPackage.OPERATION__PARAM_EXTRA:
        return basicSetParamExtra(null, msgs);
      case CrossPlatformPackage.OPERATION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case CrossPlatformPackage.OPERATION__TYPE:
        return basicSetType(null, msgs);
      case CrossPlatformPackage.OPERATION__CMD_LIST:
        return ((InternalEList<?>)getCmdList()).basicRemove(otherEnd, msgs);
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
      case CrossPlatformPackage.OPERATION__PARAM_EXTRA:
        return getParamExtra();
      case CrossPlatformPackage.OPERATION__NAME:
        return getName();
      case CrossPlatformPackage.OPERATION__PARAMS:
        return getParams();
      case CrossPlatformPackage.OPERATION__TYPE:
        return getType();
      case CrossPlatformPackage.OPERATION__GENERIC_TYPES_DECL:
        return getGenericTypesDecl();
      case CrossPlatformPackage.OPERATION__COL1:
        return getCol1();
      case CrossPlatformPackage.OPERATION__ARRAY:
        return getArray();
      case CrossPlatformPackage.OPERATION__COL2:
        return getCol2();
      case CrossPlatformPackage.OPERATION__CMD_LIST:
        return getCmdList();
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
      case CrossPlatformPackage.OPERATION__PARAM_EXTRA:
        setParamExtra((ExprArit)newValue);
        return;
      case CrossPlatformPackage.OPERATION__NAME:
        setName((String)newValue);
        return;
      case CrossPlatformPackage.OPERATION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case CrossPlatformPackage.OPERATION__TYPE:
        setType((DSLTypeRef)newValue);
        return;
      case CrossPlatformPackage.OPERATION__GENERIC_TYPES_DECL:
        getGenericTypesDecl().clear();
        getGenericTypesDecl().addAll((Collection<? extends Type>)newValue);
        return;
      case CrossPlatformPackage.OPERATION__COL1:
        setCol1((String)newValue);
        return;
      case CrossPlatformPackage.OPERATION__ARRAY:
        setArray((Integer)newValue);
        return;
      case CrossPlatformPackage.OPERATION__COL2:
        setCol2((String)newValue);
        return;
      case CrossPlatformPackage.OPERATION__CMD_LIST:
        getCmdList().clear();
        getCmdList().addAll((Collection<? extends CommandOperation>)newValue);
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
      case CrossPlatformPackage.OPERATION__PARAM_EXTRA:
        setParamExtra((ExprArit)null);
        return;
      case CrossPlatformPackage.OPERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CrossPlatformPackage.OPERATION__PARAMS:
        getParams().clear();
        return;
      case CrossPlatformPackage.OPERATION__TYPE:
        setType((DSLTypeRef)null);
        return;
      case CrossPlatformPackage.OPERATION__GENERIC_TYPES_DECL:
        getGenericTypesDecl().clear();
        return;
      case CrossPlatformPackage.OPERATION__COL1:
        setCol1(COL1_EDEFAULT);
        return;
      case CrossPlatformPackage.OPERATION__ARRAY:
        setArray(ARRAY_EDEFAULT);
        return;
      case CrossPlatformPackage.OPERATION__COL2:
        setCol2(COL2_EDEFAULT);
        return;
      case CrossPlatformPackage.OPERATION__CMD_LIST:
        getCmdList().clear();
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
      case CrossPlatformPackage.OPERATION__PARAM_EXTRA:
        return paramExtra != null;
      case CrossPlatformPackage.OPERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CrossPlatformPackage.OPERATION__PARAMS:
        return params != null && !params.isEmpty();
      case CrossPlatformPackage.OPERATION__TYPE:
        return type != null;
      case CrossPlatformPackage.OPERATION__GENERIC_TYPES_DECL:
        return genericTypesDecl != null && !genericTypesDecl.isEmpty();
      case CrossPlatformPackage.OPERATION__COL1:
        return COL1_EDEFAULT == null ? col1 != null : !COL1_EDEFAULT.equals(col1);
      case CrossPlatformPackage.OPERATION__ARRAY:
        return array != ARRAY_EDEFAULT;
      case CrossPlatformPackage.OPERATION__COL2:
        return COL2_EDEFAULT == null ? col2 != null : !COL2_EDEFAULT.equals(col2);
      case CrossPlatformPackage.OPERATION__CMD_LIST:
        return cmdList != null && !cmdList.isEmpty();
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

} //OperationImpl