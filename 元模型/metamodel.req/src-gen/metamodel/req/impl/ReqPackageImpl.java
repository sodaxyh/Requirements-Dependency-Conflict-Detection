/**
 */
package metamodel.req.impl;

import metamodel.req.Abnormal;
import metamodel.req.Assoc;
import metamodel.req.Composite;
import metamodel.req.Constrain;
import metamodel.req.Depend;
import metamodel.req.Event;
import metamodel.req.Functional_req;
import metamodel.req.Inconsistency;
import metamodel.req.Input_output;
import metamodel.req.Interact;
import metamodel.req.Interface_req;
import metamodel.req.Interlock;
import metamodel.req.Nonfunctional_req;
import metamodel.req.Normal;
import metamodel.req.Operation;
import metamodel.req.Operation_event;
import metamodel.req.Performance;
import metamodel.req.Realize;
import metamodel.req.Reliability;
import metamodel.req.Req;
import metamodel.req.ReqFactory;
import metamodel.req.ReqPackage;
import metamodel.req.Restriction;
import metamodel.req.Security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqPackageImpl extends EPackageImpl implements ReqPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_reqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonfunctional_reqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functional_reqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abnormalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass input_outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operation_eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inconsistencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interlockEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metamodel.req.ReqPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReqPackageImpl() {
		super(eNS_URI, ReqFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ReqPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReqPackage init() {
		if (isInited)
			return (ReqPackage) EPackage.Registry.INSTANCE.getEPackage(ReqPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReqPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReqPackageImpl theReqPackage = registeredReqPackage instanceof ReqPackageImpl
				? (ReqPackageImpl) registeredReqPackage
				: new ReqPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theReqPackage.createPackageContents();

		// Initialize created meta-data
		theReqPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReqPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReqPackage.eNS_URI, theReqPackage);
		return theReqPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReq() {
		return reqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReq_ID() {
		return (EAttribute) reqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReq_Description() {
		return (EAttribute) reqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReq_Name() {
		return (EAttribute) reqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_req() {
		return interface_reqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_req_Receiver() {
		return (EAttribute) interface_reqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_req_Sender() {
		return (EAttribute) interface_reqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonfunctional_req() {
		return nonfunctional_reqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonfunctional_req_Vtype() {
		return (EAttribute) nonfunctional_reqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctional_req() {
		return functional_reqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_req_Event() {
		return (EAttribute) functional_reqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_req_Agent() {
		return (EAttribute) functional_reqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_req_Operation() {
		return (EAttribute) functional_reqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_req_Input() {
		return (EAttribute) functional_reqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_req_Output() {
		return (EAttribute) functional_reqEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_req_Restriction() {
		return (EAttribute) functional_reqEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssoc() {
		return assocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssoc_Source() {
		return (EReference) assocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssoc_Target() {
		return (EReference) assocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRS() {
		return srsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSRS_Reqs() {
		return (EReference) srsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRS_ID() {
		return (EAttribute) srsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRS_Name() {
		return (EAttribute) srsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSRS_Assocs() {
		return (EReference) srsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbnormal() {
		return abnormalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormal() {
		return normalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealize() {
		return realizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrain() {
		return constrainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepend() {
		return dependEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteract() {
		return interactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestriction() {
		return restrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput_output() {
		return input_outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformance() {
		return performanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformance_Rtype() {
		return (EAttribute) performanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformance_Sign() {
		return (EAttribute) performanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformance_Value() {
		return (EAttribute) performanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformance_Unit() {
		return (EAttribute) performanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliability() {
		return reliabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliability_Sign1() {
		return (EAttribute) reliabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliability_Sign2() {
		return (EAttribute) reliabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliability_Duration() {
		return (EAttribute) reliabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliability_Pr() {
		return (EAttribute) reliabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation_event() {
		return operation_eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInconsistency() {
		return inconsistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterlock() {
		return interlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqFactory getReqFactory() {
		return (ReqFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		reqEClass = createEClass(REQ);
		createEAttribute(reqEClass, REQ__ID);
		createEAttribute(reqEClass, REQ__DESCRIPTION);
		createEAttribute(reqEClass, REQ__NAME);

		interface_reqEClass = createEClass(INTERFACE_REQ);
		createEAttribute(interface_reqEClass, INTERFACE_REQ__RECEIVER);
		createEAttribute(interface_reqEClass, INTERFACE_REQ__SENDER);

		nonfunctional_reqEClass = createEClass(NONFUNCTIONAL_REQ);
		createEAttribute(nonfunctional_reqEClass, NONFUNCTIONAL_REQ__VTYPE);

		functional_reqEClass = createEClass(FUNCTIONAL_REQ);
		createEAttribute(functional_reqEClass, FUNCTIONAL_REQ__EVENT);
		createEAttribute(functional_reqEClass, FUNCTIONAL_REQ__AGENT);
		createEAttribute(functional_reqEClass, FUNCTIONAL_REQ__OPERATION);
		createEAttribute(functional_reqEClass, FUNCTIONAL_REQ__INPUT);
		createEAttribute(functional_reqEClass, FUNCTIONAL_REQ__OUTPUT);
		createEAttribute(functional_reqEClass, FUNCTIONAL_REQ__RESTRICTION);

		assocEClass = createEClass(ASSOC);
		createEReference(assocEClass, ASSOC__SOURCE);
		createEReference(assocEClass, ASSOC__TARGET);

		srsEClass = createEClass(SRS);
		createEReference(srsEClass, SRS__REQS);
		createEAttribute(srsEClass, SRS__ID);
		createEAttribute(srsEClass, SRS__NAME);
		createEReference(srsEClass, SRS__ASSOCS);

		abnormalEClass = createEClass(ABNORMAL);

		normalEClass = createEClass(NORMAL);

		realizeEClass = createEClass(REALIZE);

		constrainEClass = createEClass(CONSTRAIN);

		dependEClass = createEClass(DEPEND);

		compositeEClass = createEClass(COMPOSITE);

		interactEClass = createEClass(INTERACT);

		operationEClass = createEClass(OPERATION);

		restrictionEClass = createEClass(RESTRICTION);

		eventEClass = createEClass(EVENT);

		input_outputEClass = createEClass(INPUT_OUTPUT);

		performanceEClass = createEClass(PERFORMANCE);
		createEAttribute(performanceEClass, PERFORMANCE__RTYPE);
		createEAttribute(performanceEClass, PERFORMANCE__SIGN);
		createEAttribute(performanceEClass, PERFORMANCE__VALUE);
		createEAttribute(performanceEClass, PERFORMANCE__UNIT);

		reliabilityEClass = createEClass(RELIABILITY);
		createEAttribute(reliabilityEClass, RELIABILITY__SIGN1);
		createEAttribute(reliabilityEClass, RELIABILITY__SIGN2);
		createEAttribute(reliabilityEClass, RELIABILITY__DURATION);
		createEAttribute(reliabilityEClass, RELIABILITY__PR);

		securityEClass = createEClass(SECURITY);

		operation_eventEClass = createEClass(OPERATION_EVENT);

		inconsistencyEClass = createEClass(INCONSISTENCY);

		interlockEClass = createEClass(INTERLOCK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interface_reqEClass.getESuperTypes().add(this.getReq());
		nonfunctional_reqEClass.getESuperTypes().add(this.getReq());
		functional_reqEClass.getESuperTypes().add(this.getReq());
		abnormalEClass.getESuperTypes().add(this.getAssoc());
		normalEClass.getESuperTypes().add(this.getAssoc());
		realizeEClass.getESuperTypes().add(this.getNormal());
		constrainEClass.getESuperTypes().add(this.getNormal());
		dependEClass.getESuperTypes().add(this.getNormal());
		compositeEClass.getESuperTypes().add(this.getNormal());
		interactEClass.getESuperTypes().add(this.getNormal());
		operationEClass.getESuperTypes().add(this.getInconsistency());
		restrictionEClass.getESuperTypes().add(this.getInconsistency());
		eventEClass.getESuperTypes().add(this.getInconsistency());
		input_outputEClass.getESuperTypes().add(this.getInterlock());
		performanceEClass.getESuperTypes().add(this.getNonfunctional_req());
		reliabilityEClass.getESuperTypes().add(this.getNonfunctional_req());
		securityEClass.getESuperTypes().add(this.getNonfunctional_req());
		operation_eventEClass.getESuperTypes().add(this.getInterlock());
		inconsistencyEClass.getESuperTypes().add(this.getAbnormal());
		interlockEClass.getESuperTypes().add(this.getAbnormal());

		// Initialize classes, features, and operations; add parameters
		initEClass(reqEClass, Req.class, "Req", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReq_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Req.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReq_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Req.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReq_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Req.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_reqEClass, Interface_req.class, "Interface_req", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_req_Receiver(), ecorePackage.getEString(), "Receiver", null, 0, 1,
				Interface_req.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_req_Sender(), ecorePackage.getEString(), "Sender", null, 0, 1, Interface_req.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonfunctional_reqEClass, Nonfunctional_req.class, "Nonfunctional_req", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonfunctional_req_Vtype(), ecorePackage.getEString(), "Vtype", null, 0, 1,
				Nonfunctional_req.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(functional_reqEClass, Functional_req.class, "Functional_req", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctional_req_Event(), ecorePackage.getEString(), "Event", null, 0, 1, Functional_req.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctional_req_Agent(), ecorePackage.getEString(), "Agent", null, 0, 1, Functional_req.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctional_req_Operation(), ecorePackage.getEString(), "Operation", null, 0, 1,
				Functional_req.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctional_req_Input(), ecorePackage.getEString(), "Input", null, 0, 1, Functional_req.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctional_req_Output(), ecorePackage.getEString(), "Output", null, 0, 1,
				Functional_req.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctional_req_Restriction(), ecorePackage.getEString(), "Restriction", null, 0, 1,
				Functional_req.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(assocEClass, Assoc.class, "Assoc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssoc_Source(), this.getReq(), null, "source", null, 1, 1, Assoc.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAssoc_Target(), this.getReq(), null, "target", null, 1, 1, Assoc.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(srsEClass, metamodel.req.SRS.class, "SRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSRS_Reqs(), this.getReq(), null, "reqs", null, 0, -1, metamodel.req.SRS.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSRS_ID(), ecorePackage.getEString(), "ID", null, 0, 1, metamodel.req.SRS.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSRS_Name(), ecorePackage.getEString(), "Name", null, 0, 1, metamodel.req.SRS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSRS_Assocs(), this.getAssoc(), null, "assocs", null, 0, -1, metamodel.req.SRS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abnormalEClass, Abnormal.class, "Abnormal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalEClass, Normal.class, "Normal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realizeEClass, Realize.class, "Realize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constrainEClass, Constrain.class, "Constrain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependEClass, Depend.class, "Depend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactEClass, Interact.class, "Interact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(input_outputEClass, Input_output.class, "Input_output", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(performanceEClass, Performance.class, "Performance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformance_Rtype(), ecorePackage.getEString(), "Rtype", null, 0, 1, Performance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformance_Sign(), ecorePackage.getEString(), "Sign", null, 0, 1, Performance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformance_Value(), ecorePackage.getEBigInteger(), "Value", null, 0, 1, Performance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformance_Unit(), ecorePackage.getEString(), "Unit", null, 0, 1, Performance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reliabilityEClass, Reliability.class, "Reliability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReliability_Sign1(), ecorePackage.getEString(), "Sign1", null, 0, 1, Reliability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliability_Sign2(), ecorePackage.getEString(), "Sign2", null, 0, 1, Reliability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliability_Duration(), ecorePackage.getEString(), "Duration", null, 0, 1, Reliability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliability_Pr(), ecorePackage.getEBigInteger(), "Pr", null, 0, 1, Reliability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operation_eventEClass, Operation_event.class, "Operation_event", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(inconsistencyEClass, Inconsistency.class, "Inconsistency", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interlockEClass, Interlock.class, "Interlock", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ReqPackageImpl
