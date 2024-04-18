package org.d2i.ckn.model.qoe;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class AlertEvent {
    @Getter
    @Setter
    private String server_id;
    @Getter
    @Setter
    private String service_id;
    @Getter
    @Setter
    private String client_id;
    @Getter
    @Setter
    private String metric;
    @Getter
    @Setter
    private float pred_accuracy;
    @Getter
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date added_time;

    public AlertEvent(String serverId, String serviceId, String clientId, String metric, float predAccuracy, Date addedTime) {
        this.server_id = serverId;
        this.service_id = serviceId;
        this.client_id = clientId;
        this.metric = metric;
        this.pred_accuracy = predAccuracy;
        this.added_time = addedTime;
    }
}
