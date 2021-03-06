package io.metersphere.base.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class ApiScenario implements Serializable {
    private String id;

    private String projectId;

    private String tagId;

    private String userId;

    private String apiScenarioModuleId;

    private String modulePath;

    private String name;

    private String level;

    private String status;

    private String principal;

    private Integer stepTotal;

    private String followPeople;

    private String schedule;

    private String description;

    private Long createTime;

    private Long updateTime;

    private String scenarioDefinition;

    private static final long serialVersionUID = 1L;
}