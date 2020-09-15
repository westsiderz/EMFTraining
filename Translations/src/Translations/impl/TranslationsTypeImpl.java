/**
 */
package Translations.impl;

import Translations.TranslatedStringType;
import Translations.TranslationsPackage;
import Translations.TranslationsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Translations.impl.TranslationsTypeImpl#getTranslatedString <em>Translated String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TranslationsTypeImpl extends MinimalEObjectImpl.Container implements TranslationsType {
	/**
	 * The cached value of the '{@link #getTranslatedString() <em>Translated String</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslatedString()
	 * @generated
	 * @ordered
	 */
	protected EList<TranslatedStringType> translatedString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TranslationsPackage.Literals.TRANSLATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TranslatedStringType> getTranslatedString() {
		if (translatedString == null) {
			translatedString = new EObjectContainmentEList<TranslatedStringType>(TranslatedStringType.class, this, TranslationsPackage.TRANSLATIONS_TYPE__TRANSLATED_STRING);
		}
		return translatedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TranslationsPackage.TRANSLATIONS_TYPE__TRANSLATED_STRING:
				return ((InternalEList<?>)getTranslatedString()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TranslationsPackage.TRANSLATIONS_TYPE__TRANSLATED_STRING:
				return getTranslatedString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TranslationsPackage.TRANSLATIONS_TYPE__TRANSLATED_STRING:
				getTranslatedString().clear();
				getTranslatedString().addAll((Collection<? extends TranslatedStringType>)newValue);
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
			case TranslationsPackage.TRANSLATIONS_TYPE__TRANSLATED_STRING:
				getTranslatedString().clear();
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
			case TranslationsPackage.TRANSLATIONS_TYPE__TRANSLATED_STRING:
				return translatedString != null && !translatedString.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TranslationsTypeImpl
