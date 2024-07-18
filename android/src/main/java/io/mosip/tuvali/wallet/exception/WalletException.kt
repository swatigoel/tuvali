package io.mosip.tuvali.wallet.exception

import io.mosip.tuvali.exception.BLEException
import io.mosip.tuvali.exception.ErrorCode

open class WalletException(message: String, cause: Exception?): BLEException(message, cause, errorCode = ErrorCode.WalletUnknownException)
