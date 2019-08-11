/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone.impl;

import ic.ac.uk.xdrone.xDrone.Color;
import ic.ac.uk.xdrone.xDrone.XDronePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.ColorImpl#getColor_value <em>Color value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color
{
  /**
   * The default value of the '{@link #getColor_value() <em>Color value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor_value()
   * @generated
   * @ordered
   */
  protected static final String COLOR_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColor_value() <em>Color value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor_value()
   * @generated
   * @ordered
   */
  protected String color_value = COLOR_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorImpl()
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
    return XDronePackage.Literals.COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColor_value()
  {
    return color_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor_value(String newColor_value)
  {
    String oldColor_value = color_value;
    color_value = newColor_value;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDronePackage.COLOR__COLOR_VALUE, oldColor_value, color_value));
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
      case XDronePackage.COLOR__COLOR_VALUE:
        return getColor_value();
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
      case XDronePackage.COLOR__COLOR_VALUE:
        setColor_value((String)newValue);
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
      case XDronePackage.COLOR__COLOR_VALUE:
        setColor_value(COLOR_VALUE_EDEFAULT);
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
      case XDronePackage.COLOR__COLOR_VALUE:
        return COLOR_VALUE_EDEFAULT == null ? color_value != null : !COLOR_VALUE_EDEFAULT.equals(color_value);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (color_value: ");
    result.append(color_value);
    result.append(')');
    return result.toString();
  }

} //ColorImpl