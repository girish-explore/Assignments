package com.company.payment.forex.forex.service;

import com.company.payment.forex.forex.dto.ForexRequest;
import com.company.payment.forex.forex.dto.ForexResponse;

public interface ForexManager {
   public ForexResponse getRates(ForexRequest req);
}
