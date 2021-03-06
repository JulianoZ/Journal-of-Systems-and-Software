/**
 * generated by Xtext 2.24.0
 */
package br.dslcross.crossplatform.crossPlatform.impl;

import br.dslcross.crossplatform.crossPlatform.CrossPlatformPackage;
import br.dslcross.crossplatform.crossPlatform.DSLGenericType;
import br.dslcross.crossplatform.crossPlatform.DSLTypeRef;
import br.dslcross.crossplatform.crossPlatform.Global;
import br.dslcross.crossplatform.crossPlatform.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.GlobalImpl#getGenericTypes <em>Generic Types</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.GlobalImpl#getParams <em>Params</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.GlobalImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.dslcross.crossplatform.crossPlatform.impl.GlobalImpl#getGenericTypesDecl <em>Generic Types Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalImpl extends TypeImpl implements Global
{
  /**
   * The cached value of the '{@link #getGenericTypes() <em>Generic Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericTypes()
   * @generated
   * @ordered
   */
  protected EList<DSLGenericType> genericTypes;

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
   * The cached value of the '{@link #getGenericTypesDecl() <em>Generic Types Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericTypesDecl()
   * @generated
   * @ordered
   */
  protected DSLGenericType genericTypesDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GlobalImpl()
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
    return CrossPlatformPackage.Literals.GLOBAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DSLGenericType> getGenericTypes()
  {
    if (genericTypes == null)
    {
      genericTypes = new EObjectContainmentEList<DSLGenericType>(DSLGenericType.class, this, CrossPlatformPackage.GLOBAL__GENERIC_TYPES);
    }
    return genericTypes;
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
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, CrossPlatformPackage.GLOBAL__PARAMS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.GLOBAL__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.GLOBAL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.GLOBAL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.GLOBAL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLGenericType getGenericTypesDecl()
  {
    return genericTypesDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenericTypesDecl(DSLGenericType newGenericTypesDecl, NotificationChain msgs)
  {
    DSLGenericType oldGenericTypesDecl = genericTypesDecl;
    genericTypesDecl = newGenericTypesDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL, oldGenericTypesDecl, newGenericTypesDecl);
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
  public void setGenericTypesDecl(DSLGenericType newGenericTypesDecl)
  {
    if (newGenericTypesDecl != genericTypesDecl)
    {
      NotificationChain msgs = null;
      if (genericTypesDecl != null)
        msgs = ((InternalEObject)genericTypesDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL, null, msgs);
      if (newGenericTypesDecl != null)
        msgs = ((InternalEObject)newGenericTypesDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL, null, msgs);
      msgs = basicSetGenericTypesDecl(newGenericTypesDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL, newGenericTypesDecl, newGenericTypesDecl));
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
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES:
        return ((InternalEList<?>)getGenericTypes()).basicRemove(otherEnd, msgs);
      case CrossPlatformPackage.GLOBAL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case CrossPlatformPackage.GLOBAL__TYPE:
        return basicSetType(null, msgs);
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL:
        return basicSetGenericTypesDecl(null, msgs);
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
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES:
        return getGenericTypes();
      case CrossPlatformPackage.GLOBAL__PARAMS:
        return getParams();
      case CrossPlatformPackage.GLOBAL__TYPE:
        return getType();
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL:
        return getGenericTypesDecl();
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
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES:
        getGenericTypes().clear();
        getGenericTypes().addAll((Collection<? extends DSLGenericType>)newValue);
        return;
      case CrossPlatformPackage.GLOBAL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case CrossPlatformPackage.GLOBAL__TYPE:
        setType((DSLTypeRef)newValue);
        return;
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL:
        setGenericTypesDecl((DSLGenericType)newValue);
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
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES:
        getGenericTypes().clear();
        return;
      case CrossPlatformPackage.GLOBAL__PARAMS:
        getParams().clear();
        return;
      case CrossPlatformPackage.GLOBAL__TYPE:
        setType((DSLTypeRef)null);
        return;
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL:
        setGenericTypesDecl((DSLGenericType)null);
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
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES:
        return genericTypes != null && !genericTypes.isEmpty();
      case CrossPlatformPackage.GLOBAL__PARAMS:
        return params != null && !params.isEmpty();
      case CrossPlatformPackage.GLOBAL__TYPE:
        return type != null;
      case CrossPlatformPackage.GLOBAL__GENERIC_TYPES_DECL:
        return genericTypesDecl != null;
    }
    return super.eIsSet(featureID);
  }

} //GlobalImpl
