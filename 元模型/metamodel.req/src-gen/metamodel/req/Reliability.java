/**
 */
package metamodel.req;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reliability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.Reliability#getSign1 <em>Sign1</em>}</li>
 *   <li>{@link metamodel.req.Reliability#getSign2 <em>Sign2</em>}</li>
 *   <li>{@link metamodel.req.Reliability#getDuration <em>Duration</em>}</li>
 *   <li>{@link metamodel.req.Reliability#getPr <em>Pr</em>}</li>
 * </ul>
 *
 * @see metamodel.req.ReqPackage#getReliability()
 * @model
 * @generated
 */
public interface Reliability extends Nonfunctional_req {
	/**
	 * Returns the value of the '<em><b>Sign1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign1</em>' attribute.
	 * @see #setSign1(String)
	 * @see metamodel.req.ReqPackage#getReliability_Sign1()
	 * @model
	 * @generated
	 */
	String getSign1();

	/**
	 * Sets the value of the '{@link metamodel.req.Reliability#getSign1 <em>Sign1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign1</em>' attribute.
	 * @see #getSign1()
	 * @generated
	 */
	void setSign1(String value);

	/**
	 * Returns the value of the '<em><b>Sign2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign2</em>' attribute.
	 * @see #setSign2(String)
	 * @see metamodel.req.ReqPackage#getReliability_Sign2()
	 * @model
	 * @generated
	 */
	String getSign2();

	/**
	 * Sets the value of the '{@link metamodel.req.Reliability#getSign2 <em>Sign2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign2</em>' attribute.
	 * @see #getSign2()
	 * @generated
	 */
	void setSign2(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see metamodel.req.ReqPackage#getReliability_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link metamodel.req.Reliability#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Pr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pr</em>' attribute.
	 * @see #setPr(BigInteger)
	 * @see metamodel.req.ReqPackage#getReliability_Pr()
	 * @model
	 * @generated
	 */
	BigInteger getPr();

	/**
	 * Sets the value of the '{@link metamodel.req.Reliability#getPr <em>Pr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pr</em>' attribute.
	 * @see #getPr()
	 * @generated
	 */
	void setPr(BigInteger value);

} // Reliability
