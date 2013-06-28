/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.VisualizationAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.VisualizationAttributeImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualizationAttributeImpl extends ViewComponentPartImpl implements VisualizationAttribute
{
  /**
   * The cached value of the '{@link #getStructuralFeature() <em>Structural Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructuralFeature()
   * @generated
   * @ordered
   */
  protected StructuralFeature structuralFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisualizationAttributeImpl()
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
    return CorePackage.Literals.VISUALIZATION_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuralFeature getStructuralFeature()
  {
    if (structuralFeature != null && structuralFeature.eIsProxy())
    {
      InternalEObject oldStructuralFeature = (InternalEObject)structuralFeature;
      structuralFeature = (StructuralFeature)eResolveProxy(oldStructuralFeature);
      if (structuralFeature != oldStructuralFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
      }
    }
    return structuralFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuralFeature basicGetStructuralFeature()
  {
    return structuralFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructuralFeature(StructuralFeature newStructuralFeature)
  {
    StructuralFeature oldStructuralFeature = structuralFeature;
    structuralFeature = newStructuralFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
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
      case CorePackage.VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE:
        if (resolve) return getStructuralFeature();
        return basicGetStructuralFeature();
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
      case CorePackage.VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE:
        setStructuralFeature((StructuralFeature)newValue);
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
      case CorePackage.VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE:
        setStructuralFeature((StructuralFeature)null);
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
      case CorePackage.VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE:
        return structuralFeature != null;
    }
    return super.eIsSet(featureID);
  }

} //VisualizationAttributeImpl
