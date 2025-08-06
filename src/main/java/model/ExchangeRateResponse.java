package main.java.model;

import java.util.Map;

public class ExchangeRateResponse {
    private String result;
    private String documentation;
    private String terms_of_use;
    private long time_last_update_unix;
    private String time_last_update_utc;
    private String time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private Map<String, Double> conversion_rates;

    public ExchangeRateResponse(String result, String documentation, String terms_of_use,
                                long time_last_update_unix, String time_last_update_utc,
                                String time_next_update_unix, String time_next_update_utc,
                                String base_code, Map<String, Double> conversion_rates) {
        this.result = result;
        this.documentation = documentation;
        this.terms_of_use = terms_of_use;
        this.time_last_update_unix = time_last_update_unix;
        this.time_last_update_utc = time_last_update_utc;
        this.time_next_update_unix = time_next_update_unix;
        this.time_next_update_utc = time_next_update_utc;
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }
    
    public String getResult() {
        return result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public String getTermsOfUse() {
        return terms_of_use;
    }

    public long getTimeLastUpdateUnix() {
        return time_last_update_unix;
    }

    public String getTimeLastUpdateUtc() {
        return time_last_update_utc;
    }

    public String getTimeNextUpdateUnix() {
        return time_next_update_unix;
    }

    public String getTimeNextUpdateUtc() {
        return time_next_update_utc;
    }   

    
    public String getBaseCode() {
        return base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }
}