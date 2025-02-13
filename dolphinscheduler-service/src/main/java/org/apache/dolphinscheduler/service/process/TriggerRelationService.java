/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.service.process;

import org.apache.dolphinscheduler.common.enums.ApiTriggerType;
import org.apache.dolphinscheduler.dao.entity.TriggerRelation;

import org.springframework.stereotype.Component;

/**
 *  Trigger relation operator to db，because operator command process instance
 */
@Component
public interface TriggerRelationService {

    void saveTriggerToDb(ApiTriggerType type, Long triggerCode, Integer jobId);

    TriggerRelation queryByTypeAndJobId(ApiTriggerType apiTriggerType, int jobId);

    int queryByTriggerRelationCodeAndTypeAndJobId(Integer triggerType, Long triggerCode, Integer jobId);

    int saveCommandTrigger(Integer commandId, Integer processInstanceId);

    int saveProcessInstanceTrigger(Integer commandId, Integer processInstanceId);
}
