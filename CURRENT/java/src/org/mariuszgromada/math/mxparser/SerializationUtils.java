/*
 * @(#)SerializationUtils.java        5.1.0    2022-11-11
 *
 * MathParser.org-mXparser DUAL LICENSE AGREEMENT as of date 2022-05-22
 * The most up-to-date license is available at the below link:
 * - https://mathparser.org/mxparser-license
 *
 * AUTHOR: Copyright 2010 - 2022 Mariusz Gromada - All rights reserved
 * PUBLISHER: INFIMA - https://payhip.com/infima
 *
 * SOFTWARE means source code and/or binary form and/or documentation.
 * PRODUCT: MathParser.org-mXparser SOFTWARE
 * LICENSE: DUAL LICENSE AGREEMENT
 *
 * BY INSTALLING, COPYING, OR OTHERWISE USING THE PRODUCT, YOU AGREE TO BE
 * BOUND BY ALL OF THE TERMS AND CONDITIONS OF THE DUAL LICENSE AGREEMENT.
 *
 * AUTHOR & PUBLISHER provide the PRODUCT under the DUAL LICENSE AGREEMENT
 * model designed to meet the needs of both non-commercial use as well as
 * commercial use.
 *
 * NON-COMMERCIAL USE means any use or activity where a fee is not charged
 * and the purpose is not the sale of a good or service, and the use or
 * activity is not intended to produce a profit. NON-COMMERCIAL USE examples:
 *
 * 1. Free Open-Source Software ("FOSS").
 * 2. Non-commercial use in research, scholarly and education.
 *
 * COMMERCIAL USE means any use or activity where a fee is charged or the
 * purpose is the sale of a good or service, or the use or activity is
 * intended to produce a profit. COMMERCIAL USE examples:
 *
 * 1. OEMs (Original Equipment Manufacturers).
 * 2. ISVs (Independent Software Vendors).
 * 3. VARs (Value Added Resellers).
 * 4. Other distributors that combine and distribute commercially licensed
 *    software.
 *
 * IN CASE YOU WANT TO USE THE PRODUCT COMMERCIALLY, YOU MUST PURCHASE THE
 * APPROPRIATE LICENSE FROM "INFIMA" ONLINE STORE, STORE ADDRESS:
 *
 * 1. https://mathparser.org/order-commercial-license
 * 2. https://payhip.com/infima
 *
 * NON-COMMERCIAL LICENSE
 *
 * Redistribution and use of the PRODUCT in source and/or binary forms,
 * with or without modification, are permitted provided that the following
 * conditions are met:
 *
 * 1. Redistributions of source code must retain unmodified content of the
 *    entire MathParser.org-mXparser DUAL LICENSE AGREEMENT, including
 *    definition of NON-COMMERCIAL USE, definition of COMMERCIAL USE,
 *    NON-COMMERCIAL LICENSE conditions, COMMERCIAL LICENSE conditions, and
 *    the following DISCLAIMER.
 * 2. Redistributions in binary form must reproduce the entire content of
 *    MathParser.org-mXparser DUAL LICENSE AGREEMENT in the documentation
 *    and/or other materials provided with the distribution, including
 *    definition of NON-COMMERCIAL USE, definition of COMMERCIAL USE,
 *    NON-COMMERCIAL LICENSE conditions, COMMERCIAL LICENSE conditions, and
 *    the following DISCLAIMER.
 * 3. Any form of redistribution requires confirmation and signature of
 *    the NON-COMMERCIAL USE by successfully calling the method:
 *       License.iConfirmNonCommercialUse(...)
 *    The method call takes place only internally for logging purposes and
 *    there is no connection with other external services and no data is
 *    sent or collected. The lack of a method call (or its successful call)
 *    does not affect the operation of the PRODUCT in any way. Please see
 *    the API documentation.
 *
 * COMMERCIAL LICENSE
 *
 *  1. Before purchasing a commercial license, AUTHOR & PUBLISHER allow you
 *     to download, install and use up to three copies of the PRODUCT to
 *     perform integration tests, confirm the quality of the PRODUCT and
 *     its suitability. The testing period should be limited to fourteen
 *     days. Tests should be performed under the conditions of test
 *     environments. The purpose of the tests must not be to generate profit.
 *  2. Provided that you purchased a license from "INFIMA" online store
 *     (store address: https://mathparser.org/order-commercial-license or
 *     https://payhip.com/infima), and you comply with all below terms and
 *     conditions, and you have acknowledged and understood the following
 *     DISCLAIMER, AUTHOR & PUBLISHER grant you a nonexclusive license
 *     including the following rights:
 *  3. The license has been granted only to you, i.e., the person or entity
 *     that made the purchase, who is identified and confirmed by the data
 *     provided during the purchase.
 *  4. In case you purchased a license in the "ONE-TIME PURCHASE" model,
 *     the license has been granted only for the PRODUCT version specified
 *     in the purchase. The upgrade policy gives you additional rights and
 *     is described in the dedicated section below.
 *  5. In case you purchased a license in the "SUBSCRIPTION" model, you can
 *     install and use any version of the PRODUCT, but only during the
 *     subscription validity period.
 *  6. In case you purchased a "SINGLE LICENSE" you can install and use the
 *     PRODUCT from one workstation.
 *  7. Additional copies of the PRODUCT can be installed and used from more
 *     than one workstation; however, this number is limited to the number
 *     of workstations purchased as per order.
 *  8. In case you purchased a "SITE LICENSE ", the PRODUCT can be installed
 *     and used from all workstations located at your premises.
 *  9. You may incorporate the unmodified PRODUCT into your own products
 *     and software.
 * 10. If you purchased a license with the "SOURCE CODE" option, you may
 *     modify the PRODUCT's source code and incorporate the modified source
 *     code into your own products and/or software.
 * 11. Provided that the license validity period has not expired, you may
 *     distribute your product and/or software with the incorporated
 *     PRODUCT royalty-free.
 * 12. You may make copies of the PRODUCT for backup and archival purposes.
 * 13. Any form of redistribution requires confirmation and signature of
 *     the COMMERCIAL USE by successfully calling the method:
 *        License.iConfirmCommercialUse(...)
 *     The method call takes place only internally for logging purposes and
 *     there is no connection with other external services and no data is
 *     sent or collected. The lack of a method call (or its successful call)
 *     does not affect the operation of the PRODUCT in any way. Please see
 *     the API documentation.
 * 14. AUTHOR & PUBLISHER reserve all rights not expressly granted to you
 *     in this agreement.
 *
 * ADDITIONAL CLARIFICATION ON WORKSTATION
 *
 * A workstation is a device, a remote device, or a virtual device, used by
 * you, your employees, or other entities to whom you have commissioned the
 * tasks. For example, the number of workstations may refer to the number
 * of software developers, engineers, architects, scientists, and other
 * professionals who use the PRODUCT on your behalf. The number of
 * workstations is not the number of copies of your end-product that you
 * distribute to your end-users.
 *
 * By purchasing the COMMERCIAL LICENSE, you only pay for the number of
 * workstations, while the number of copies of your final product
 * (delivered to your end-users) is not limited.
 *
 * UPGRADE POLICY
 *
 * The PRODUCT is versioned according to the following convention:
 *
 *    [MAJOR].[MINOR].[PATCH]
 *
 * 1. COMMERCIAL LICENSE holders can install and use the updated version
 *    for bug fixes free of charge, i.e. if you have purchased a license
 *    for the [MAJOR].[MINOR] version (e.g.: 5.0), you can freely install
 *    all the various releases specified in the [PATCH] version (e.g.: 5.0.2).
 *    The license terms remain unchanged after the update.
 * 2. COMMERCIAL LICENSE holders for [MAJOR].[MINOR] version (e.g.: 5.0)
 *    can install and use the updated version [MAJOR].[MINOR + 1] free of
 *    charge, i.e., plus one release in the [MINOR] range (e.g.: 5.1). The
 *    license terms remain unchanged after the update.
 * 3. COMMERCIAL LICENSE holders who wish to upgrade their version, but are
 *    not eligible for the free upgrade, can claim a discount when
 *    purchasing the upgrade. For this purpose, please contact us via e-mail.
 *
 * DISCLAIMER
 *
 * THIS PRODUCT IS PROVIDED BY AUTHOR & PUBLISHER "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL AUTHOR OR PUBLISHER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS PRODUCT, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 *
 * THE VIEWS AND CONCLUSIONS CONTAINED IN THE PRODUCT AND DOCUMENTATION ARE
 * THOSE OF THE AUTHORS AND SHOULD NOT BE INTERPRETED AS REPRESENTING
 * OFFICIAL POLICIES, EITHER EXPRESSED OR IMPLIED, OF AUTHOR OR PUBLISHER.
 *
 * CONTACT
 *
 * - e-mail: info@mathparser.org
 * - website: https://mathparser.org
 * - source code: https://github.com/mariuszgromada/MathParser.org-mXparser
 * - online store: https://mathparser.org/order-commercial-license
 * - online store: https://payhip.com/infima
 */
package org.mariuszgromada.math.mxparser;

import java.io.*;
import java.util.Base64;
/**
 * A utility class for simplified serialization and deserialization of parser objects (and not only).
 *
 * Important - using binary serialization you confirm that
 * you understand the security risks.
 *
 * WARNING: Deserializing data from an untrusted source can introduce
 * security vulnerabilities to your application. Depending on the settings
 * used during deserialization, untrusted data may be able to execute
 * arbitrary code or cause a denial of service attack. Untrusted data
 * can come from over the network from an untrusted source
 * (e.g. any network client), or it can be manipulated/tampered by
 * an intermediary while in transit over an unauthenticated connection,
 * or from local storage where it may have been compromised/tampered,
 * or from many other sources. MathParser.org-mXparser does not provide
 * any means to authenticate data or secure it from tampering.
 * Use an appropriate data authentication method before deserializing.
 * Be very mindful of these attack scenarios; many projects and companies
 * and users of serialization libraries in general have been bitten by
 * untrusted deserialization of user data in the past.
 *
 * @author         <b>Mariusz Gromada</b><br>
 *                 <a href="https://mathparser.org" target="_blank">MathParser.org - mXparser project page</a><br>
 *                 <a href="https://github.com/mariuszgromada/MathParser.org-mXparser" target="_blank">mXparser on GitHub</a><br>
 *                 <a href="https://payhip.com/INFIMA" target="_blank">INFIMA place to purchase a commercial MathParser.org-mXparser software license</a><br>
 *                 <a href="mailto:info@mathparser.org">info@mathparser.org</a><br>
 *                 <a href="https://scalarmath.org/" target="_blank">ScalarMath.org - a powerful math engine and math scripting language</a><br>
 *                 <a href="https://play.google.com/store/apps/details?id=org.mathparser.scalar.lite" target="_blank">Scalar Lite</a><br>
 *                 <a href="https://play.google.com/store/apps/details?id=org.mathparser.scalar.pro" target="_blank">Scalar Pro</a><br>
 *                 <a href="https://mathspace.pl" target="_blank">MathSpace.pl</a><br>
 *
 * @version        5.1.0
 *
 * @see Expression
 * @see Argument
 * @see RecursiveArgument
 * @see Constant
 * @see Function
 */
public final class SerializationUtils {
    private static boolean binarySerializationEnabled = false;
    /**
     * Enables binary serialization done by the SerializationUtils.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     */
    public static void enableBinarySerializationIamAwareOfSecurityRisks() {
        binarySerializationEnabled = true;
        lastOperationWasSuccessful = true;
        logLastOperationMessage(INFO_BINARY_SERIALIZATION_ENABLED);
    }
    /**
     * Disables binary serialization done by the SerializationUtils.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     */
    public static void disableBinarySerialization() {
        binarySerializationEnabled = false;
        lastOperationWasSuccessful = true;
        logLastOperationMessage(INFO_BINARY_SERIALIZATION_DISABLED);
    }
    /**
     * Returns whether binary serialization done by SerializationUtils is enabled by.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @return True if enabled, false if disabled.
     */
    public static boolean isBinarySerializationEnabled() {
        return binarySerializationEnabled;
    }
    private static boolean lastOperationWasSuccessful = false;
    private static String lastOperationMessage = "";
    /**
     * Information whether the last ordered operation under
     * any serialization or deserialization method was correctly
     * performed.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @return true if the operation was performed correctly, otherwise false.
     */
    public static boolean checkLastOperationWasSuccessful() {
        return lastOperationWasSuccessful;
    }
    /**
     * Text information about the last operation performed
     * by any serialization or deserialization method.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @return The content of the error in case of failure, information
     * about the operation performed in case of success.
     */
    public static String getLastOperationMessage() {
        return lastOperationMessage;
    }
    private static void logLastOperationMessage(String message) {
        lastOperationMessage = message + "\n" + WARNING_BINARY_SERIALIZATION_SECURITY_RISKS;
    }
    /**
     * Serialization of an object to byte data.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @param objectToSerialize The object for which serialization is possible.
     *
     * @return The data object if the operation was successful, otherwise it returns null.
     * @see #getLastOperationMessage()
     * @see #checkLastOperationWasSuccessful()
     */
    public static byte[] serializeToBytes(Serializable objectToSerialize) {
        lastOperationWasSuccessful = false;
        if (!binarySerializationEnabled) {
            logLastOperationMessage(INFO_BINARY_SERIALIZATION_DISABLED);
            return null;
        }
        if (objectToSerialize == null) {
            logLastOperationMessage(ERROR_NULL_OBJECT);
            return null;
        }
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(baos);
            synchronized (objectToSerialize) {
                oos.writeObject(objectToSerialize);
                oos.close();
            }
            logLastOperationMessage(INFO_SERIALIZATION_PERFORMED + " " + getSimpleName(objectToSerialize));
            lastOperationWasSuccessful = true;
            return baos.toByteArray();
        } catch (Exception e) {
            logLastOperationMessage(INFO_EXCEPTION + " " + getSimpleName(e) + ", " + e.getMessage());
            return null;
        }
    }
    /**
     * Serialization of an object to String data.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @param objectToSerialize The object for which serialization is possible.
     *
     * @return The data string if the operation was successful, otherwise it returns null.
     * @see #getLastOperationMessage()
     * @see #checkLastOperationWasSuccessful()
     */
    public static String serializeToString(Serializable objectToSerialize) {
        lastOperationWasSuccessful = false;
        byte[] data = serializeToBytes(objectToSerialize);
        if (data == null) return null;
        return Base64.getEncoder().encodeToString(data);
    }
    /**
     * Serialization of an object to a file.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @param objectToSerialize The object for which serialization is possible.
     * @param filePath  File path
     *
     * @return true if the operation was successful, otherwise it returns false.
     * @see #getLastOperationMessage()
     * @see #checkLastOperationWasSuccessful()
     */
    public static boolean serializeToFile(Serializable objectToSerialize, String filePath) {
        lastOperationWasSuccessful = false;
        if (!binarySerializationEnabled) {
            logLastOperationMessage(INFO_BINARY_SERIALIZATION_DISABLED);
            return false;
        }
        if (filePath == null) {
            logLastOperationMessage(ERROR_NULL_FILE_PATH);
            return false;
        }
        if (filePath.length() == 0) {
            logLastOperationMessage(ERROR_FILE_PATH_ZERO_LENGTH);
            return false;
        }
        if (objectToSerialize == null) {
            logLastOperationMessage(ERROR_NULL_OBJECT);
            return false;
        }
        File file = new File(filePath);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            synchronized (objectToSerialize) {
                oos.writeObject(objectToSerialize);
                oos.close();
            }
            logLastOperationMessage(INFO_SERIALIZATION_PERFORMED + " " + getSimpleName(objectToSerialize) + ", " + filePath);
            lastOperationWasSuccessful = true;
            return true;
        } catch (Exception e) {
            logLastOperationMessage(INFO_EXCEPTION + " " + getSimpleName(e) + ", " + e.getMessage());
            return false;
        }
    }
    /**
     * Deserializes an object from byte data.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @param data Data object.
     * @param <T> Resulting class type.
     *
     * @return The deserialized object if operation was successful, otherwise it returns null.
     */
    public static <T> T deserializeFromBytes(byte[] data) {
        lastOperationWasSuccessful = false;
        if (!binarySerializationEnabled) {
            logLastOperationMessage(INFO_BINARY_SERIALIZATION_DISABLED);
            return null;
        }
        if (data == null) {
            logLastOperationMessage(ERROR_NULL_DATA);
            return null;
        }
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bais);
            @SuppressWarnings("unchecked")
            T deserializedObject = (T) ois.readObject();
            ois.close();
            lastOperationWasSuccessful = true;
            logLastOperationMessage(INFO_DESERIALIZATION_PERFORMED + " " + getSimpleName(deserializedObject));
            return deserializedObject;
        } catch (Exception e) {
            logLastOperationMessage(INFO_EXCEPTION + " " + getSimpleName(e) + ", " + e.getMessage());
            return null;
        }
    }
    /**
     * Deserializes an object from string data.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @param data Data object.
     * @param <T> Resulting class type.
     *
     * @return The deserialized object if operation was successful, otherwise it returns null.
     */
    public static <T> T deserializeFromString(String data) {
        lastOperationWasSuccessful = false;
        if (!binarySerializationEnabled) {
            logLastOperationMessage(INFO_BINARY_SERIALIZATION_DISABLED);
            return null;
        }
        if (data == null) {
            logLastOperationMessage(ERROR_NULL_DATA);
            return null;
        }
        return deserializeFromBytes(Base64.getDecoder().decode(data));
    }
    /**
     * Deserializes an object from byte data.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @param filePath File path.
     * @param <T> Resulting class type.
     *
     * @return The deserialized object if operation was successful, otherwise it returns null.
     */
    public static <T> T deserializeFromFile(String filePath) {
        lastOperationWasSuccessful = false;
        if (!binarySerializationEnabled) {
            logLastOperationMessage(INFO_BINARY_SERIALIZATION_DISABLED);
            return null;
        }
        if (filePath == null) {
            logLastOperationMessage(ERROR_NULL_FILE_PATH);
            return null;
        }
        if (filePath.length() == 0) {
            logLastOperationMessage(ERROR_FILE_PATH_ZERO_LENGTH);
            return null;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            logLastOperationMessage(ERROR_FILE_NOT_EXISTS + " " + filePath);
            return null;
        }
        if (!file.isFile()) {
            logLastOperationMessage(ERROR_IS_NOT_A_FILE + " " + filePath);
            return null;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            @SuppressWarnings("unchecked")
            T deserializedObject = (T) ois.readObject();
            ois.close();
            lastOperationWasSuccessful = true;
            logLastOperationMessage(INFO_DESERIALIZATION_PERFORMED + " " + getSimpleName(deserializedObject) + ", " + filePath);
            return deserializedObject;
        } catch (Exception e) {
            logLastOperationMessage(INFO_EXCEPTION + " " + getSimpleName(e) + ", " + e.getMessage());
            return null;
        }
    }
    private static String getSimpleName(Object obj) {
        if (obj == null)
            return "<UNKNOWN>";
        else
            return obj.getClass().getSimpleName();
    }
    /**
     * Unique serialization UID based on library version and class id.
     *
     * Important - using binary serialization you confirm that
     * you understand the security risks.
     *
     * WARNING: Deserializing data from an untrusted source can introduce
     * security vulnerabilities to your application. Depending on the settings
     * used during deserialization, untrusted data may be able to execute
     * arbitrary code or cause a denial of service attack. Untrusted data
     * can come from over the network from an untrusted source
     * (e.g. any network client), or it can be manipulated/tampered by
     * an intermediary while in transit over an unauthenticated connection,
     * or from local storage where it may have been compromised/tampered,
     * or from many other sources. MathParser.org-mXparser does not provide
     * any means to authenticate data or secure it from tampering.
     * Use an appropriate data authentication method before deserializing.
     * Be very mindful of these attack scenarios; many projects and companies
     * and users of serialization libraries in general have been bitten by
     * untrusted deserialization of user data in the past.
     *
     * @param classId Class id
     *
     * @return The digits from the right 0 the first two digits are the class id,
     * the digits 3 and 4 are the parser version in the PATCH range,
     * the digits 5 and 6 are the parser version in the MINOR range,
     * the digits 7 and 8 are the parser version in the MAJOR range.
     */
    public static long getSerialVersionUID(int classId) {
        return	1000000L * (long) mXparser.VERSION_MAJOR
                + 10000L * (long) mXparser.VERSION_MINOR
                + 100L * (long) mXparser.VERSION_PATCH
                + 1L * (long) classId
                ;
    }
    private static final String INFO_SERIALIZATION_PERFORMED = "Serialization has been performed:";
    private static final String INFO_DESERIALIZATION_PERFORMED = "Deserialization has been performed:";
    private static final String ERROR_NULL_OBJECT = "Null object passed in the parameter.";
    private static final String ERROR_NULL_FILE_PATH = "Null file passed in the parameter.";
    private static final String ERROR_FILE_PATH_ZERO_LENGTH = "The file path does not contain any characters.";
    private static final String ERROR_IS_NOT_A_FILE = "The file path is not a file:";
    private static final String ERROR_FILE_NOT_EXISTS = "The file path does not exits:";
    private static final String ERROR_NULL_DATA = "Null data passed in the parameter.";
    private static final String ERROR_NULL_TYPE = "Null type passed in the parameter.";
    private static final String INFO_EXCEPTION = "Exception: ";
    private static final String INFO_BINARY_SERIALIZATION_ENABLED = "Binary serialization is enabled. Use it only in a conscious and limited way.";
    private static final String INFO_BINARY_SERIALIZATION_DISABLED = "Binary serialization is disabled. You can enable it if you are aware of security risks.";
    private static final String WARNING_BINARY_SERIALIZATION_SECURITY_RISKS =
            "SECURITY WARNING:\n"
            + "Deserializing data from an untrusted source can introduce security vulnerabilities\n"
            + "to your application. Depending on the settings used during deserialization,\n"
            + "untrusted data may be able to execute arbitrary code or cause a denial of service\n"
            + "attack. Untrusted data can come from over the network from an untrusted source\n"
            + "(e.g. any network client), or it can be manipulated/tampered by an intermediary while\n"
            + "in transit over an unauthenticated connection, or from local storage where it may\n"
            + "have been compromised/tampered, or from many other sources. MathParser.org-mXparser\n"
            + "does not provide any means to authenticate data or secure it from tampering. Use an\n"
            + "appropriate data authentication method before deserializing. Be very mindful of these\n"
            + "attack scenarios; many projects and companies and users of serialization libraries in\n"
            + "general have been bitten by untrusted deserialization of user data in the past."
            ;
}