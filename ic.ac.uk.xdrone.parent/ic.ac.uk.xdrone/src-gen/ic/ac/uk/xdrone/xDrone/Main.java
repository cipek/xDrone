/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.Main#getFly <em>Fly</em>}</li>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.Main#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * Returns the value of the '<em><b>Fly</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fly</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fly</em>' containment reference.
   * @see #setFly(Fly)
   * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getMain_Fly()
   * @model containment="true"
   * @generated
   */
  Fly getFly();

  /**
   * Sets the value of the '{@link ic.ac.uk.xdrone.xDrone.Main#getFly <em>Fly</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fly</em>' containment reference.
   * @see #getFly()
   * @generated
   */
  void setFly(Fly value);

  /**
   * Returns the value of the '<em><b>Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment</em>' containment reference.
   * @see #setEnvironment(Environment)
   * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getMain_Environment()
   * @model containment="true"
   * @generated
   */
  Environment getEnvironment();

  /**
   * Sets the value of the '{@link ic.ac.uk.xdrone.xDrone.Main#getEnvironment <em>Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Environment</em>' containment reference.
   * @see #getEnvironment()
   * @generated
   */
  void setEnvironment(Environment value);

} // Main