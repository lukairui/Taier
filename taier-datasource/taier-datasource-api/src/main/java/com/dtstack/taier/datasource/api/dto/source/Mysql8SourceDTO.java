package com.dtstack.taier.datasource.api.dto.source;


import com.dtstack.taier.datasource.api.source.DataSourceType;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @company: www.dtstack.com
 * @Author ：WangChuan
 * @Date ：Created in 17:50 2020/5/22
 * @Description：Mysql8数据源信息
 */
@Data
@ToString
@SuperBuilder
public class Mysql8SourceDTO extends RdbmsSourceDTO {


    @Override
    public Integer getSourceType() {
        return DataSourceType.MySQL8.getVal();
    }

}