/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone.impl;

import ic.ac.uk.xdrone.xDrone.Wait;
import ic.ac.uk.xdrone.xDrone.XDronePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.WaitImpl#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaitImpl extends CommandImpl implements Wait
{
  /**
   * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected static final String SECONDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected String seconds = SECONDS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WaitImpl()
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
    return XDronePackage.Literals.WAIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSeconds()
  {
    return seconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeconds(String newSeconds)
  {
    String oldSeconds = seconds;
    seconds = newSeconds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDronePackage.WAIT__SECONDS, oldSeconds, seconds));
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
      case XDronePackage.WAIT__SECONDS:
        return getSeconds();
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
      case XDronePackage.WAIT__SECONDS:
        setSeconds((String)newValue);
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
      case XDronePackage.WAIT__SECONDS:
        setSeconds(SECONDS_EDEFAULT);
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
      case XDronePackage.WAIT__SECONDS:
        return SECONDS_EDEFAULT == null ? seconds != null : !SECONDS_EDEFAULT.equals(seconds);
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
    result.append(" (seconds: ");
    result.append(seconds);
    result.append(')');
    return result.toString();
  }

} //WaitImpl
