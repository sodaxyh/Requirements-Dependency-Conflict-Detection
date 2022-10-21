/**
 */
package metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.SRS#getReqs <em>Reqs</em>}</li>
 *   <li>{@link metamodel.req.SRS#getID <em>ID</em>}</li>
 *   <li>{@link metamodel.req.SRS#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.req.SRS#getAssocs <em>Assocs</em>}</li>
 * </ul>
 *
 * @see metamodel.req.ReqPackage#getSRS()
 * @model
 * @generated
 */
public interface SRS extends EObject {
	/**
	 * Returns the value of the '<em><b>Reqs</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.req.Req}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reqs</em>' containment reference list.
	 * @see metamodel.req.ReqPackage#getSRS_Reqs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Req> getReqs();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see metamodel.req.ReqPackage#getSRS_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link metamodel.req.SRS#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodel.req.ReqPackage#getSRS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.req.SRS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assocs</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.req.Assoc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assocs</em>' containment reference list.
	 * @see metamodel.req.ReqPackage#getSRS_Assocs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assoc> getAssocs();

} // SRS
