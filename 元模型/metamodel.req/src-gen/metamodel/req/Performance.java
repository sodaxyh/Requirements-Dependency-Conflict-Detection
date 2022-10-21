/**
 */
package metamodel.req;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.Performance#getRtype <em>Rtype</em>}</li>
 *   <li>{@link metamodel.req.Performance#getSign <em>Sign</em>}</li>
 *   <li>{@link metamodel.req.Performance#getValue <em>Value</em>}</li>
 *   <li>{@link metamodel.req.Performance#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see metamodel.req.ReqPackage#getPerformance()
 * @model
 * @generated
 */
public interface Performance extends Nonfunctional_req {
	/**
	 * Returns the value of the '<em><b>Rtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtype</em>' attribute.
	 * @see #setRtype(String)
	 * @see metamodel.req.ReqPackage#getPerformance_Rtype()
	 * @model
	 * @generated
	 */
	String getRtype();

	/**
	 * Sets the value of the '{@link metamodel.req.Performance#getRtype <em>Rtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtype</em>' attribute.
	 * @see #getRtype()
	 * @generated
	 */
	void setRtype(String value);

	/**
	 * Returns the value of the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign</em>' attribute.
	 * @see #setSign(String)
	 * @see metamodel.req.ReqPackage#getPerformance_Sign()
	 * @model
	 * @generated
	 */
	String getSign();

	/**
	 * Sets the value of the '{@link metamodel.req.Performance#getSign <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign</em>' attribute.
	 * @see #getSign()
	 * @generated
	 */
	void setSign(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see metamodel.req.ReqPackage#getPerformance_Value()
	 * @model
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link metamodel.req.Performance#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see metamodel.req.ReqPackage#getPerformance_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link metamodel.req.Performance#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Performance
