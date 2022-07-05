/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.taier.dao.mapper;

import com.dtstack.taier.dao.domain.DevelopSelectSql;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DevelopHiveSelectSqlMapper {

    /**
     * 根据 jobId 查询SQL记录
     * @param jobId
     * @param tenantId
     * @param isDeleted
     * @return
     */
    DevelopSelectSql getByJobId(@Param("jobId") String jobId, @Param("tenantId") Long tenantId, @Param("isDeleted") Integer isDeleted);

    /**
     * 插入 sql执行记录
     * @param selectSql
     * @return
     */
    Integer insert(DevelopSelectSql selectSql);

    Integer updateGmtModify(@Param("jobId") String jobId, @Param("tenantId") Long tenantId);

    Integer deleteByJobId(@Param("jobId") String jobId, @Param("tenantId") Long tenantId);

    List<DevelopSelectSql> listSelectTypeByGmtModified(@Param("timeDiff")Integer timeDiff);

    Integer deleteByIds(@Param("list") List<Long> list);

    Integer deleteByJobIds(@Param("list") List<String> list);

    List<DevelopSelectSql> listBySqlType(@Param("type") Integer type);

    Integer deleteByTenantId(@Param("tenantId") Long tenantId);
}
