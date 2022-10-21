/**
 */
package metamodel.req;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.Assoc#getSource <em>Source</em>}</li>
 *   <li>{@link metamodel.req.Assoc#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see metamodel.req.ReqPackage#getAssoc()
 * @model abstract="true"
 * @generated
 */
public interface Assoc extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Req)
	 * @see metamodel.req.ReqPackage#getAssoc_Source()
	 * @model required="true"
	 * @generated
	 */
	Req getSource();

	/**
	 * Sets the value of the '{@link metamodel.req.Assoc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Req value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Req)
	 * @see metamodel.req.ReqPackage#getAssoc_Target()
	 * @model required="true"
	 * @generated
	 */
	Req getTarget();

	/**
	 * Sets the value of the '{@link metamodel.req.Assoc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Req value);

} // Assoc
