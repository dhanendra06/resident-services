package io.mosip.resident.dto;

import lombok.Data;

import java.io.Serializable;

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Data
public class PublicKeyResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5038613164048257390L;

	/** The Certificate. */
	private String certificate;

	/** The issued at. */
	private String issuedAt;

	/** The expiry at. */
	private String expiryAt;
	
	public String publicKey;

	/**
	 * Instantiates a new public key response dto.
	 *
	 * @param publicKey
	 *            the public key
	 * @param issuedAt
	 *            the issued at
	 * @param expiryAt
	 *            the expiry at
	 */
	public PublicKeyResponseDto(String certificate, String issuedAt, String expiryAt) {
		this.certificate = certificate;
		this.issuedAt = issuedAt;
		this.expiryAt = expiryAt;
	}
	public PublicKeyResponseDto() {
		
	}

}
