/**
 */
package metamodel.req;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.Interface_req#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link metamodel.req.Interface_req#getSender <em>Sender</em>}</li>
 * </ul>
 *
 * @see metamodel.req.ReqPackage#getInterface_req()
 * @model
 * @generated
 */
public interface Interface_req extends Req {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' attribute.
	 * @see #setReceiver(String)
	 * @see metamodel.req.ReqPackage#getInterface_req_Receiver()
	 * @model
	 * @generated
	 */
	String getReceiver();

	/**
	 * Sets the value of the '{@link metamodel.req.Interface_req#getReceiver <em>Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' attribute.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(String value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' attribute.
	 * @see #setSender(String)
	 * @see metamodel.req.ReqPackage#getInterface_req_Sender()
	 * @model
	 * @generated
	 */
	String getSender();

	/**
	 * Sets the value of the '{@link metamodel.req.Interface_req#getSender <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' attribute.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(String value);

} // Interface_req
