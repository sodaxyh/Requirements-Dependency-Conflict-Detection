/**
 */
package metamodel.req.impl;

import metamodel.req.Nonfunctional_req;
import metamodel.req.ReqPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonfunctional req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.impl.Nonfunctional_reqImpl#getVtype <em>Vtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Nonfunctional_reqImpl extends ReqImpl implements Nonfunctional_req {
	/**
	 * The default value of the '{@link #getVtype() <em>Vtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtype()
	 * @generated
	 * @ordered
	 */
	protected static final String VTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVtype() <em>Vtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtype()
	 * @generated
	 * @ordered
	 */
	protected String vtype = VTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nonfunctional_reqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.NONFUNCTIONAL_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVtype() {
		return vtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVtype(String newVtype) {
		String oldVtype = vtype;
		vtype = newVtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.NONFUNCTIONAL_REQ__VTYPE, oldVtype,
					vtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReqPackage.NONFUNCTIONAL_REQ__VTYPE:
			return getVtype();
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
		case ReqPackage.NONFUNCTIONAL_REQ__VTYPE:
			setVtype((String) newValue);
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
		case ReqPackage.NONFUNCTIONAL_REQ__VTYPE:
			setVtype(VTYPE_EDEFAULT);
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
		case ReqPackage.NONFUNCTIONAL_REQ__VTYPE:
			return VTYPE_EDEFAULT == null ? vtype != null : !VTYPE_EDEFAULT.equals(vtype);
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
		result.append(" (Vtype: ");
		result.append(vtype);
		result.append(')');
		return result.toString();
	}

} //Nonfunctional_reqImpl
