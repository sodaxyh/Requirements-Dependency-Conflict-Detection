/**
 */
package metamodel.req;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metamodel.req.ReqFactory
 * @model kind="package"
 * @generated
 */
public interface ReqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "req";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/req";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "req";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReqPackage eINSTANCE = metamodel.req.impl.ReqPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodel.req.impl.ReqImpl <em>Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.ReqImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getReq()
	 * @generated
	 */
	int REQ = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ__NAME = 2;

	/**
	 * The number of structural features of the '<em>Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.Interface_reqImpl <em>Interface req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.Interface_reqImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getInterface_req()
	 * @generated
	 */
	int INTERFACE_REQ = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQ__ID = REQ__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQ__DESCRIPTION = REQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQ__NAME = REQ__NAME;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQ__RECEIVER = REQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQ__SENDER = REQ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQ_FEATURE_COUNT = REQ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQ_OPERATION_COUNT = REQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.Nonfunctional_reqImpl <em>Nonfunctional req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.Nonfunctional_reqImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getNonfunctional_req()
	 * @generated
	 */
	int NONFUNCTIONAL_REQ = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONFUNCTIONAL_REQ__ID = REQ__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONFUNCTIONAL_REQ__DESCRIPTION = REQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONFUNCTIONAL_REQ__NAME = REQ__NAME;

	/**
	 * The feature id for the '<em><b>Vtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONFUNCTIONAL_REQ__VTYPE = REQ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nonfunctional req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONFUNCTIONAL_REQ_FEATURE_COUNT = REQ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nonfunctional req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONFUNCTIONAL_REQ_OPERATION_COUNT = REQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.Functional_reqImpl <em>Functional req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.Functional_reqImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getFunctional_req()
	 * @generated
	 */
	int FUNCTIONAL_REQ = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__ID = REQ__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__DESCRIPTION = REQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__NAME = REQ__NAME;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__EVENT = REQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__AGENT = REQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__OPERATION = REQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__INPUT = REQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__OUTPUT = REQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ__RESTRICTION = REQ_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Functional req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ_FEATURE_COUNT = REQ_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Functional req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQ_OPERATION_COUNT = REQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.AssocImpl <em>Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.AssocImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getAssoc()
	 * @generated
	 */
	int ASSOC = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOC__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.SRSImpl <em>SRS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.SRSImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getSRS()
	 * @generated
	 */
	int SRS = 5;

	/**
	 * The feature id for the '<em><b>Reqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRS__REQS = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRS__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Assocs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRS__ASSOCS = 3;

	/**
	 * The number of structural features of the '<em>SRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>SRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.AbnormalImpl <em>Abnormal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.AbnormalImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getAbnormal()
	 * @generated
	 */
	int ABNORMAL = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABNORMAL__SOURCE = ASSOC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABNORMAL__TARGET = ASSOC__TARGET;

	/**
	 * The number of structural features of the '<em>Abnormal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABNORMAL_FEATURE_COUNT = ASSOC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abnormal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABNORMAL_OPERATION_COUNT = ASSOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.NormalImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__SOURCE = ASSOC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__TARGET = ASSOC__TARGET;

	/**
	 * The number of structural features of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FEATURE_COUNT = ASSOC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_OPERATION_COUNT = ASSOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.RealizeImpl <em>Realize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.RealizeImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getRealize()
	 * @generated
	 */
	int REALIZE = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZE__SOURCE = NORMAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZE__TARGET = NORMAL__TARGET;

	/**
	 * The number of structural features of the '<em>Realize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZE_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Realize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZE_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.ConstrainImpl <em>Constrain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.ConstrainImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getConstrain()
	 * @generated
	 */
	int CONSTRAIN = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAIN__SOURCE = NORMAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAIN__TARGET = NORMAL__TARGET;

	/**
	 * The number of structural features of the '<em>Constrain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAIN_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constrain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAIN_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.DependImpl <em>Depend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.DependImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getDepend()
	 * @generated
	 */
	int DEPEND = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPEND__SOURCE = NORMAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPEND__TARGET = NORMAL__TARGET;

	/**
	 * The number of structural features of the '<em>Depend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPEND_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Depend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPEND_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.CompositeImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SOURCE = NORMAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TARGET = NORMAL__TARGET;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.InteractImpl <em>Interact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.InteractImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getInteract()
	 * @generated
	 */
	int INTERACT = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT__SOURCE = NORMAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT__TARGET = NORMAL__TARGET;

	/**
	 * The number of structural features of the '<em>Interact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.InconsistencyImpl <em>Inconsistency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.InconsistencyImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getInconsistency()
	 * @generated
	 */
	int INCONSISTENCY = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY__SOURCE = ABNORMAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY__TARGET = ABNORMAL__TARGET;

	/**
	 * The number of structural features of the '<em>Inconsistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_FEATURE_COUNT = ABNORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inconsistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_OPERATION_COUNT = ABNORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.OperationImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SOURCE = INCONSISTENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TARGET = INCONSISTENCY__TARGET;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = INCONSISTENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = INCONSISTENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.RestrictionImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__SOURCE = INCONSISTENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__TARGET = INCONSISTENCY__TARGET;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = INCONSISTENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OPERATION_COUNT = INCONSISTENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.EventImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SOURCE = INCONSISTENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TARGET = INCONSISTENCY__TARGET;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = INCONSISTENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = INCONSISTENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.InterlockImpl <em>Interlock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.InterlockImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getInterlock()
	 * @generated
	 */
	int INTERLOCK = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK__SOURCE = ABNORMAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK__TARGET = ABNORMAL__TARGET;

	/**
	 * The number of structural features of the '<em>Interlock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK_FEATURE_COUNT = ABNORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interlock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK_OPERATION_COUNT = ABNORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.Input_outputImpl <em>Input output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.Input_outputImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getInput_output()
	 * @generated
	 */
	int INPUT_OUTPUT = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT__SOURCE = INTERLOCK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT__TARGET = INTERLOCK__TARGET;

	/**
	 * The number of structural features of the '<em>Input output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_FEATURE_COUNT = INTERLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_OPERATION_COUNT = INTERLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.PerformanceImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__ID = NONFUNCTIONAL_REQ__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__DESCRIPTION = NONFUNCTIONAL_REQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__NAME = NONFUNCTIONAL_REQ__NAME;

	/**
	 * The feature id for the '<em><b>Vtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__VTYPE = NONFUNCTIONAL_REQ__VTYPE;

	/**
	 * The feature id for the '<em><b>Rtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__RTYPE = NONFUNCTIONAL_REQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__SIGN = NONFUNCTIONAL_REQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__VALUE = NONFUNCTIONAL_REQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__UNIT = NONFUNCTIONAL_REQ_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_FEATURE_COUNT = NONFUNCTIONAL_REQ_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_OPERATION_COUNT = NONFUNCTIONAL_REQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.ReliabilityImpl <em>Reliability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.ReliabilityImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getReliability()
	 * @generated
	 */
	int RELIABILITY = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__ID = NONFUNCTIONAL_REQ__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__DESCRIPTION = NONFUNCTIONAL_REQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__NAME = NONFUNCTIONAL_REQ__NAME;

	/**
	 * The feature id for the '<em><b>Vtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__VTYPE = NONFUNCTIONAL_REQ__VTYPE;

	/**
	 * The feature id for the '<em><b>Sign1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__SIGN1 = NONFUNCTIONAL_REQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sign2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__SIGN2 = NONFUNCTIONAL_REQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__DURATION = NONFUNCTIONAL_REQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__PR = NONFUNCTIONAL_REQ_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_FEATURE_COUNT = NONFUNCTIONAL_REQ_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_OPERATION_COUNT = NONFUNCTIONAL_REQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.SecurityImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__ID = NONFUNCTIONAL_REQ__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__DESCRIPTION = NONFUNCTIONAL_REQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__NAME = NONFUNCTIONAL_REQ__NAME;

	/**
	 * The feature id for the '<em><b>Vtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__VTYPE = NONFUNCTIONAL_REQ__VTYPE;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = NONFUNCTIONAL_REQ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = NONFUNCTIONAL_REQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.req.impl.Operation_eventImpl <em>Operation event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.req.impl.Operation_eventImpl
	 * @see metamodel.req.impl.ReqPackageImpl#getOperation_event()
	 * @generated
	 */
	int OPERATION_EVENT = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EVENT__SOURCE = INTERLOCK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EVENT__TARGET = INTERLOCK__TARGET;

	/**
	 * The number of structural features of the '<em>Operation event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EVENT_FEATURE_COUNT = INTERLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EVENT_OPERATION_COUNT = INTERLOCK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link metamodel.req.Req <em>Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req</em>'.
	 * @see metamodel.req.Req
	 * @generated
	 */
	EClass getReq();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Req#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see metamodel.req.Req#getID()
	 * @see #getReq()
	 * @generated
	 */
	EAttribute getReq_ID();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Req#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see metamodel.req.Req#getDescription()
	 * @see #getReq()
	 * @generated
	 */
	EAttribute getReq_Description();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Req#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.req.Req#getName()
	 * @see #getReq()
	 * @generated
	 */
	EAttribute getReq_Name();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Interface_req <em>Interface req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface req</em>'.
	 * @see metamodel.req.Interface_req
	 * @generated
	 */
	EClass getInterface_req();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Interface_req#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver</em>'.
	 * @see metamodel.req.Interface_req#getReceiver()
	 * @see #getInterface_req()
	 * @generated
	 */
	EAttribute getInterface_req_Receiver();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Interface_req#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender</em>'.
	 * @see metamodel.req.Interface_req#getSender()
	 * @see #getInterface_req()
	 * @generated
	 */
	EAttribute getInterface_req_Sender();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Nonfunctional_req <em>Nonfunctional req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nonfunctional req</em>'.
	 * @see metamodel.req.Nonfunctional_req
	 * @generated
	 */
	EClass getNonfunctional_req();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Nonfunctional_req#getVtype <em>Vtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vtype</em>'.
	 * @see metamodel.req.Nonfunctional_req#getVtype()
	 * @see #getNonfunctional_req()
	 * @generated
	 */
	EAttribute getNonfunctional_req_Vtype();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Functional_req <em>Functional req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional req</em>'.
	 * @see metamodel.req.Functional_req
	 * @generated
	 */
	EClass getFunctional_req();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Functional_req#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see metamodel.req.Functional_req#getEvent()
	 * @see #getFunctional_req()
	 * @generated
	 */
	EAttribute getFunctional_req_Event();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Functional_req#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent</em>'.
	 * @see metamodel.req.Functional_req#getAgent()
	 * @see #getFunctional_req()
	 * @generated
	 */
	EAttribute getFunctional_req_Agent();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Functional_req#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see metamodel.req.Functional_req#getOperation()
	 * @see #getFunctional_req()
	 * @generated
	 */
	EAttribute getFunctional_req_Operation();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Functional_req#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see metamodel.req.Functional_req#getInput()
	 * @see #getFunctional_req()
	 * @generated
	 */
	EAttribute getFunctional_req_Input();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Functional_req#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see metamodel.req.Functional_req#getOutput()
	 * @see #getFunctional_req()
	 * @generated
	 */
	EAttribute getFunctional_req_Output();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Functional_req#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restriction</em>'.
	 * @see metamodel.req.Functional_req#getRestriction()
	 * @see #getFunctional_req()
	 * @generated
	 */
	EAttribute getFunctional_req_Restriction();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Assoc <em>Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc</em>'.
	 * @see metamodel.req.Assoc
	 * @generated
	 */
	EClass getAssoc();

	/**
	 * Returns the meta object for the reference '{@link metamodel.req.Assoc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see metamodel.req.Assoc#getSource()
	 * @see #getAssoc()
	 * @generated
	 */
	EReference getAssoc_Source();

	/**
	 * Returns the meta object for the reference '{@link metamodel.req.Assoc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see metamodel.req.Assoc#getTarget()
	 * @see #getAssoc()
	 * @generated
	 */
	EReference getAssoc_Target();

	/**
	 * Returns the meta object for class '{@link metamodel.req.SRS <em>SRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRS</em>'.
	 * @see metamodel.req.SRS
	 * @generated
	 */
	EClass getSRS();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.req.SRS#getReqs <em>Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reqs</em>'.
	 * @see metamodel.req.SRS#getReqs()
	 * @see #getSRS()
	 * @generated
	 */
	EReference getSRS_Reqs();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.SRS#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see metamodel.req.SRS#getID()
	 * @see #getSRS()
	 * @generated
	 */
	EAttribute getSRS_ID();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.SRS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.req.SRS#getName()
	 * @see #getSRS()
	 * @generated
	 */
	EAttribute getSRS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.req.SRS#getAssocs <em>Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assocs</em>'.
	 * @see metamodel.req.SRS#getAssocs()
	 * @see #getSRS()
	 * @generated
	 */
	EReference getSRS_Assocs();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Abnormal <em>Abnormal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abnormal</em>'.
	 * @see metamodel.req.Abnormal
	 * @generated
	 */
	EClass getAbnormal();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see metamodel.req.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Realize <em>Realize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realize</em>'.
	 * @see metamodel.req.Realize
	 * @generated
	 */
	EClass getRealize();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Constrain <em>Constrain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrain</em>'.
	 * @see metamodel.req.Constrain
	 * @generated
	 */
	EClass getConstrain();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Depend <em>Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depend</em>'.
	 * @see metamodel.req.Depend
	 * @generated
	 */
	EClass getDepend();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see metamodel.req.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Interact <em>Interact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interact</em>'.
	 * @see metamodel.req.Interact
	 * @generated
	 */
	EClass getInteract();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see metamodel.req.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see metamodel.req.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see metamodel.req.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Input_output <em>Input output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input output</em>'.
	 * @see metamodel.req.Input_output
	 * @generated
	 */
	EClass getInput_output();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see metamodel.req.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Performance#getRtype <em>Rtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rtype</em>'.
	 * @see metamodel.req.Performance#getRtype()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Rtype();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Performance#getSign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign</em>'.
	 * @see metamodel.req.Performance#getSign()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Sign();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Performance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel.req.Performance#getValue()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Value();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Performance#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see metamodel.req.Performance#getUnit()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Unit();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability</em>'.
	 * @see metamodel.req.Reliability
	 * @generated
	 */
	EClass getReliability();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Reliability#getSign1 <em>Sign1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign1</em>'.
	 * @see metamodel.req.Reliability#getSign1()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Sign1();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Reliability#getSign2 <em>Sign2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign2</em>'.
	 * @see metamodel.req.Reliability#getSign2()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Sign2();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Reliability#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see metamodel.req.Reliability#getDuration()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Duration();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.req.Reliability#getPr <em>Pr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pr</em>'.
	 * @see metamodel.req.Reliability#getPr()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Pr();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see metamodel.req.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Operation_event <em>Operation event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation event</em>'.
	 * @see metamodel.req.Operation_event
	 * @generated
	 */
	EClass getOperation_event();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Inconsistency <em>Inconsistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inconsistency</em>'.
	 * @see metamodel.req.Inconsistency
	 * @generated
	 */
	EClass getInconsistency();

	/**
	 * Returns the meta object for class '{@link metamodel.req.Interlock <em>Interlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interlock</em>'.
	 * @see metamodel.req.Interlock
	 * @generated
	 */
	EClass getInterlock();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReqFactory getReqFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metamodel.req.impl.ReqImpl <em>Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.ReqImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getReq()
		 * @generated
		 */
		EClass REQ = eINSTANCE.getReq();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ__ID = eINSTANCE.getReq_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ__DESCRIPTION = eINSTANCE.getReq_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ__NAME = eINSTANCE.getReq_Name();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.Interface_reqImpl <em>Interface req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.Interface_reqImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getInterface_req()
		 * @generated
		 */
		EClass INTERFACE_REQ = eINSTANCE.getInterface_req();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_REQ__RECEIVER = eINSTANCE.getInterface_req_Receiver();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_REQ__SENDER = eINSTANCE.getInterface_req_Sender();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.Nonfunctional_reqImpl <em>Nonfunctional req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.Nonfunctional_reqImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getNonfunctional_req()
		 * @generated
		 */
		EClass NONFUNCTIONAL_REQ = eINSTANCE.getNonfunctional_req();

		/**
		 * The meta object literal for the '<em><b>Vtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NONFUNCTIONAL_REQ__VTYPE = eINSTANCE.getNonfunctional_req_Vtype();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.Functional_reqImpl <em>Functional req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.Functional_reqImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getFunctional_req()
		 * @generated
		 */
		EClass FUNCTIONAL_REQ = eINSTANCE.getFunctional_req();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQ__EVENT = eINSTANCE.getFunctional_req_Event();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQ__AGENT = eINSTANCE.getFunctional_req_Agent();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQ__OPERATION = eINSTANCE.getFunctional_req_Operation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQ__INPUT = eINSTANCE.getFunctional_req_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQ__OUTPUT = eINSTANCE.getFunctional_req_Output();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQ__RESTRICTION = eINSTANCE.getFunctional_req_Restriction();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.AssocImpl <em>Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.AssocImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getAssoc()
		 * @generated
		 */
		EClass ASSOC = eINSTANCE.getAssoc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOC__SOURCE = eINSTANCE.getAssoc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOC__TARGET = eINSTANCE.getAssoc_Target();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.SRSImpl <em>SRS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.SRSImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getSRS()
		 * @generated
		 */
		EClass SRS = eINSTANCE.getSRS();

		/**
		 * The meta object literal for the '<em><b>Reqs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRS__REQS = eINSTANCE.getSRS_Reqs();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRS__ID = eINSTANCE.getSRS_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRS__NAME = eINSTANCE.getSRS_Name();

		/**
		 * The meta object literal for the '<em><b>Assocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRS__ASSOCS = eINSTANCE.getSRS_Assocs();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.AbnormalImpl <em>Abnormal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.AbnormalImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getAbnormal()
		 * @generated
		 */
		EClass ABNORMAL = eINSTANCE.getAbnormal();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.NormalImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getNormal()
		 * @generated
		 */
		EClass NORMAL = eINSTANCE.getNormal();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.RealizeImpl <em>Realize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.RealizeImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getRealize()
		 * @generated
		 */
		EClass REALIZE = eINSTANCE.getRealize();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.ConstrainImpl <em>Constrain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.ConstrainImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getConstrain()
		 * @generated
		 */
		EClass CONSTRAIN = eINSTANCE.getConstrain();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.DependImpl <em>Depend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.DependImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getDepend()
		 * @generated
		 */
		EClass DEPEND = eINSTANCE.getDepend();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.CompositeImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.InteractImpl <em>Interact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.InteractImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getInteract()
		 * @generated
		 */
		EClass INTERACT = eINSTANCE.getInteract();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.OperationImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.RestrictionImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.EventImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.Input_outputImpl <em>Input output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.Input_outputImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getInput_output()
		 * @generated
		 */
		EClass INPUT_OUTPUT = eINSTANCE.getInput_output();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.PerformanceImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '<em><b>Rtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__RTYPE = eINSTANCE.getPerformance_Rtype();

		/**
		 * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__SIGN = eINSTANCE.getPerformance_Sign();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__VALUE = eINSTANCE.getPerformance_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__UNIT = eINSTANCE.getPerformance_Unit();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.ReliabilityImpl <em>Reliability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.ReliabilityImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getReliability()
		 * @generated
		 */
		EClass RELIABILITY = eINSTANCE.getReliability();

		/**
		 * The meta object literal for the '<em><b>Sign1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__SIGN1 = eINSTANCE.getReliability_Sign1();

		/**
		 * The meta object literal for the '<em><b>Sign2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__SIGN2 = eINSTANCE.getReliability_Sign2();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__DURATION = eINSTANCE.getReliability_Duration();

		/**
		 * The meta object literal for the '<em><b>Pr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__PR = eINSTANCE.getReliability_Pr();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.SecurityImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.Operation_eventImpl <em>Operation event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.Operation_eventImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getOperation_event()
		 * @generated
		 */
		EClass OPERATION_EVENT = eINSTANCE.getOperation_event();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.InconsistencyImpl <em>Inconsistency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.InconsistencyImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getInconsistency()
		 * @generated
		 */
		EClass INCONSISTENCY = eINSTANCE.getInconsistency();

		/**
		 * The meta object literal for the '{@link metamodel.req.impl.InterlockImpl <em>Interlock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.req.impl.InterlockImpl
		 * @see metamodel.req.impl.ReqPackageImpl#getInterlock()
		 * @generated
		 */
		EClass INTERLOCK = eINSTANCE.getInterlock();

	}

} //ReqPackage
