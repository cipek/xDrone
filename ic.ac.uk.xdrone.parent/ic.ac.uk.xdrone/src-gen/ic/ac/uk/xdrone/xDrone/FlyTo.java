/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fly To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.FlyTo#getObject_name <em>Object name</em>}</li>
 * </ul>
 *
 * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getFlyTo()
 * @model
 * @generated
 */
public interface FlyTo extends Command
{
  /**
   * Returns the value of the '<em><b>Object name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object name</em>' attribute.
   * @see #setObject_name(String)
   * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getFlyTo_Object_name()
   * @model
   * @generated
   */
  String getObject_name();

  /**
   * Sets the value of the '{@link ic.ac.uk.xdrone.xDrone.FlyTo#getObject_name <em>Object name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object name</em>' attribute.
   * @see #getObject_name()
   * @generated
   */
  void setObject_name(String value);

} // FlyTo