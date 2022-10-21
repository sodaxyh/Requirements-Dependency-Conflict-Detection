/**
 */
package metamodel.req.impl;

import java.math.BigInteger;

import metamodel.req.Reliability;
import metamodel.req.ReqPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reliability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.impl.ReliabilityImpl#getSign1 <em>Sign1</em>}</li>
 *   <li>{@link metamodel.req.impl.ReliabilityImpl#getSign2 <em>Sign2</em>}</li>
 *   <li>{@link metamodel.req.impl.ReliabilityImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link metamodel.req.impl.ReliabilityImpl#getPr <em>Pr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReliabilityImpl extends Nonfunctional_reqImpl implements Reliability {
	/**
	 * The default value of the '{@link #getSign1() <em>Sign1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign1()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGN1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSign1() <em>Sign1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign1()
	 * @generated
	 * @ordered
	 */
	protected String sign1 = SIGN1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSign2() <em>Sign2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign2()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGN2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSign2() <em>Sign2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign2()
	 * @generated
	 * @ordered
	 */
	protected String sign2 = SIGN2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPr() <em>Pr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPr() <em>Pr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pr = PR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.RELIABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSign1() {
		return sign1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSign1(String newSign1) {
		String oldSign1 = sign1;
		sign1 = newSign1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.RELIABILITY__SIGN1, oldSign1, sign1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSign2() {
		return sign2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSign2(String newSign2) {
		String oldSign2 = sign2;
		sign2 = newSign2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.RELIABILITY__SIGN2, oldSign2, sign2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.RELIABILITY__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPr() {
		return pr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPr(BigInteger newPr) {
		BigInteger oldPr = pr;
		pr = newPr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.RELIABILITY__PR, oldPr, pr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReqPackage.RELIABILITY__SIGN1:
			return getSign1();
		case ReqPackage.RELIABILITY__SIGN2:
			return getSign2();
		case ReqPackage.RELIABILITY__DURATION:
			return getDuration();
		case ReqPackage.RELIABILITY__PR:
			return getPr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReqPackage.RELIABILITY__SIGN1:
			setSign1((String) newValue);
			return;
		case ReqPackage.RELIABILITY__SIGN2:
			setSign2((String) newValue);
			return;
		case ReqPackage.RELIABILITY__DURATION:
			setDuration((String) newValue);
			return;
		case ReqPackage.RELIABILITY__PR:
			setPr((BigInteger) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ReqPackage.RELIABILITY__SIGN1:
			setSign1(SIGN1_EDEFAULT);
			return;
		case ReqPackage.RELIABILITY__SIGN2:
			setSign2(SIGN2_EDEFAULT);
			return;
		case ReqPackage.RELIABILITY__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case ReqPackage.RELIABILITY__PR:
			setPr(PR_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ReqPackage.RELIABILITY__SIGN1:
			return SIGN1_EDEFAULT == null ? sign1 != null : !SIGN1_EDEFAULT.equals(sign1);
		case ReqPackage.RELIABILITY__SIGN2:
			return SIGN2_EDEFAULT == null ? sign2 != null : !SIGN2_EDEFAULT.equals(sign2);
		case ReqPackage.RELIABILITY__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case ReqPackage.RELIABILITY__PR:
			return PR_EDEFAULT == null ? pr != null : !PR_EDEFAULT.equals(pr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Sign1: ");
		result.append(sign1);
		result.append(", Sign2: ");
		result.append(sign2);
		result.append(", Duration: ");
		result.append(duration);
		result.append(", Pr: ");
		result.append(pr);
		result.append(')');
		return result.toString();
	}

} //ReliabilityImpl
