package com.alibaba.datax.plugin.writer.hbase23xwriter;

import com.alibaba.datax.common.element.DoubleColumn;
import com.alibaba.datax.common.element.LongColumn;
import com.alibaba.datax.common.element.Record;
import com.alibaba.datax.common.exception.DataXException;
import com.alibaba.datax.common.util.Configuration;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.hadoop.hbase.client.Durability;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public  class MultiVersionTask extends HbaseAbstractTask {

    private static final Logger LOG = LoggerFactory.getLogger(NormalTask.class);

    public MultiVersionTask(Configuration configuration) {
        super(configuration);
    }

    @Override
    public Put convertRecordToPut(Record record) {
        if (record.getColumnNumber() != 4) {
            // multversion 模式下源头读取字段列数为4元组(rowkey,column,timestamp,value),目的端需告诉[]
            throw DataXException.asDataXException(
                            Hbase23xWriterErrorCode.ILLEGAL_VALUE,
                            String.format("HbaseWriter multversion模式下列配置信息有错误.源头应该为四元组,实际源头读取字段数:%s,请检查您的配置并作出修改.", record.getColumnNumber()));
        }

        throw new NotImplementedException("方法未实现，MultiVersionTask.convertRecordToPut");

    }

}
