/**
 */
package Translations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Translations.TranslationsType#getTranslatedString <em>Translated String</em>}</li>
 * </ul>
 *
 * @see Translations.TranslationsPackage#getTranslationsType()
 * @model extendedMetaData="name='Translations_._type' kind='elementOnly'"
 * @generated
 */
public interface TranslationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Translated String</b></em>' containment reference list.
	 * The list contents are of type {@link Translations.TranslatedStringType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translated String</em>' containment reference list.
	 * @see Translations.TranslationsPackage#getTranslationsType_TranslatedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TranslatedString' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TranslatedStringType> getTranslatedString();

} // TranslationsType
