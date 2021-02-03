/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform.impl;

import br.dslcross.crossplatform.crossPlatform.CommandOperation;
import br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage;
import br.dslcross.crossplatform.crossPlatform.DSLTypeRef;
import br.dslcross.crossplatform.crossPlatform.Global;
import br.dslcross.crossplatform.crossPlatform.OperationGlobCall;
import br.dslcross.crossplatform.crossPlatform.ParamList;
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
 * An implementation of the model object '<em><b>Operation Glob Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getConcreteTypes <em>Concrete Types</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getOpGlobCall <em>Op Glob Call</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getParams <em>Params</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getTypeGlobal <em>Type Global</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getGenericTypesDecl <em>Generic Types Decl</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getCol1 <em>Col1</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getArray <em>Array</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getCol2 <em>Col2</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.OperationGlobCallImpl#getCmdList <em>Cmd List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationGlobCallImpl extends CommandFeatureImpl implements OperationGlobCall
{
  /**
   * The cached value of the '{@link #getConcreteTypes() <em>Concrete Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> concreteTypes;

  /**
   * The cached value of the '{@link #getParamList() <em>Param List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamList()
   * @generated
   * @ordered
   */
  protected EList<ParamList> paramList;

  /**
   * The cached value of the '{@link #getOpGlobCall() <em>Op Glob Call</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpGlobCall()
   * @generated
   * @ordered
   */
  protected Global opGlobCall;

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
   * The cached value of the '{@link #getTypeGlobal() <em>Type Global</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeGlobal()
   * @generated
   * @ordered
   */
  protected DSLTypeRef typeGlobal;

  /**
   * The cached value of the '{@link #getGenericTypesDecl() <em>Generic Types Decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericTypesDecl()
   * @generated
   * @ordered
   */
  protected Type genericTypesDecl;

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
  protected OperationGlobCallImpl()
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
    return CrossPlatformPackage.Literals.OPERATION_GLOB_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Type> getConcreteTypes()
  {
    if (concreteTypes == null)
    {
      concreteTypes = new EObjectResolvingEList<Type>(Type.class, this, CrossPlatformPackage.OPERATION_GLOB_CALL__CONCRETE_TYPES);
    }
    return concreteTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ParamList> getParamList()
  {
    if (paramList == null)
    {
      paramList = new EObjectContainmentEList<ParamList>(ParamList.class, this, CrossPlatformPackage.OPERATION_GLOB_CALL__PARAM_LIST);
    }
    return paramList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Global getOpGlobCall()
  {
    if (opGlobCall != null && opGlobCall.eIsProxy())
    {
      InternalEObject oldOpGlobCall = (InternalEObject)opGlobCall;
      opGlobCall = (Global)eResolveProxy(oldOpGlobCall);
      if (opGlobCall != oldOpGlobCall)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrossPlatformPackage.OPERATION_GLOB_CALL__OP_GLOB_CALL, oldOpGlobCall, opGlobCall));
      }
    }
    return opGlobCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global basicGetOpGlobCall()
  {
    return opGlobCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOpGlobCall(Global newOpGlobCall)
  {
    Global oldOpGlobCall = opGlobCall;
    opGlobCall = newOpGlobCall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION_GLOB_CALL__OP_GLOB_CALL, oldOpGlobCall, opGlobCall));
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
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, CrossPlatformPackage.OPERATION_GLOB_CALL__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLTypeRef getTypeGlobal()
  {
    return typeGlobal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeGlobal(DSLTypeRef newTypeGlobal, NotificationChain msgs)
  {
    DSLTypeRef oldTypeGlobal = typeGlobal;
    typeGlobal = newTypeGlobal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL, oldTypeGlobal, newTypeGlobal);
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
  public void setTypeGlobal(DSLTypeRef newTypeGlobal)
  {
    if (newTypeGlobal != typeGlobal)
    {
      NotificationChain msgs = null;
      if (typeGlobal != null)
        msgs = ((InternalEObject)typeGlobal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL, null, msgs);
      if (newTypeGlobal != null)
        msgs = ((InternalEObject)newTypeGlobal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL, null, msgs);
      msgs = basicSetTypeGlobal(newTypeGlobal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL, newTypeGlobal, newTypeGlobal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getGenericTypesDecl()
  {
    if (genericTypesDecl != null && genericTypesDecl.eIsProxy())
    {
      InternalEObject oldGenericTypesDecl = (InternalEObject)genericTypesDecl;
      genericTypesDecl = (Type)eResolveProxy(oldGenericTypesDecl);
      if (genericTypesDecl != oldGenericTypesDecl)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrossPlatformPackage.OPERATION_GLOB_CALL__GENERIC_TYPES_DECL, oldGenericTypesDecl, genericTypesDecl));
      }
    }
    return genericTypesDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetGenericTypesDecl()
  {
    return genericTypesDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGenericTypesDecl(Type newGenericTypesDecl)
  {
    Type oldGenericTypesDecl = genericTypesDecl;
    genericTypesDecl = newGenericTypesDecl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION_GLOB_CALL__GENERIC_TYPES_DECL, oldGenericTypesDecl, genericTypesDecl));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION_GLOB_CALL__COL1, oldCol1, col1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION_GLOB_CALL__ARRAY, oldArray, array));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.OPERATION_GLOB_CALL__COL2, oldCol2, col2));
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
      cmdList = new EObjectContainmentEList<CommandOperation>(CommandOperation.class, this, CrossPlatformPackage.OPERATION_GLOB_CALL__CMD_LIST);
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
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAM_LIST:
        return ((InternalEList<?>)getParamList()).basicRemove(otherEnd, msgs);
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL:
        return basicSetTypeGlobal(null, msgs);
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CMD_LIST:
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
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CONCRETE_TYPES:
        return getConcreteTypes();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAM_LIST:
        return getParamList();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__OP_GLOB_CALL:
        if (resolve) return getOpGlobCall();
        return basicGetOpGlobCall();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAMS:
        return getParams();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL:
        return getTypeGlobal();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__GENERIC_TYPES_DECL:
        if (resolve) return getGenericTypesDecl();
        return basicGetGenericTypesDecl();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__COL1:
        return getCol1();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__ARRAY:
        return getArray();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__COL2:
        return getCol2();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CMD_LIST:
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
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CONCRETE_TYPES:
        getConcreteTypes().clear();
        getConcreteTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAM_LIST:
        getParamList().clear();
        getParamList().addAll((Collection<? extends ParamList>)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__OP_GLOB_CALL:
        setOpGlobCall((Global)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL:
        setTypeGlobal((DSLTypeRef)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__GENERIC_TYPES_DECL:
        setGenericTypesDecl((Type)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__COL1:
        setCol1((String)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__ARRAY:
        setArray((Integer)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__COL2:
        setCol2((String)newValue);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CMD_LIST:
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
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CONCRETE_TYPES:
        getConcreteTypes().clear();
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAM_LIST:
        getParamList().clear();
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__OP_GLOB_CALL:
        setOpGlobCall((Global)null);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAMS:
        getParams().clear();
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL:
        setTypeGlobal((DSLTypeRef)null);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__GENERIC_TYPES_DECL:
        setGenericTypesDecl((Type)null);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__COL1:
        setCol1(COL1_EDEFAULT);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__ARRAY:
        setArray(ARRAY_EDEFAULT);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__COL2:
        setCol2(COL2_EDEFAULT);
        return;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CMD_LIST:
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
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CONCRETE_TYPES:
        return concreteTypes != null && !concreteTypes.isEmpty();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAM_LIST:
        return paramList != null && !paramList.isEmpty();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__OP_GLOB_CALL:
        return opGlobCall != null;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__PARAMS:
        return params != null && !params.isEmpty();
      case CrossPlatformPackage.OPERATION_GLOB_CALL__TYPE_GLOBAL:
        return typeGlobal != null;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__GENERIC_TYPES_DECL:
        return genericTypesDecl != null;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__COL1:
        return COL1_EDEFAULT == null ? col1 != null : !COL1_EDEFAULT.equals(col1);
      case CrossPlatformPackage.OPERATION_GLOB_CALL__ARRAY:
        return array != ARRAY_EDEFAULT;
      case CrossPlatformPackage.OPERATION_GLOB_CALL__COL2:
        return COL2_EDEFAULT == null ? col2 != null : !COL2_EDEFAULT.equals(col2);
      case CrossPlatformPackage.OPERATION_GLOB_CALL__CMD_LIST:
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
    result.append(" (col1: ");
    result.append(col1);
    result.append(", array: ");
    result.append(array);
    result.append(", col2: ");
    result.append(col2);
    result.append(')');
    return result.toString();
  }

} //OperationGlobCallImpl