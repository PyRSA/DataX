package com.alibaba.datax.plugin.reader.hbase23xreader;

import com.alibaba.datax.common.spi.ErrorCode;


public enum Hbase23xReaderErrorCode implements ErrorCode {
    REQUIRED_VALUE("Hbase23xReader-00", "您缺失了必须填写的参数值."),
    ILLEGAL_VALUE("Hbase23xReader-01", "您填写的参数值不合法."),
    PREPAR_READ_ERROR("HbaseReader-02", "准备读取 HBase 时出错."),
    SPLIT_ERROR("HbaseReader-03", "切分 Hbase 表时出错."),
    GET_HBASE_CONNECTION_ERROR("HbaseReader-04", "获取HBase连接时出错."),
    GET_HBASE_TABLE_ERROR("HbaseReader-05", "初始化 HBase 抽取表时出错."),
    GET_HBASE_REGINLOCTOR_ERROR("HbaseReader-06", "获取 HBase RegionLocator时出错."),
    CLOSE_HBASE_CONNECTION_ERROR("HbaseReader-07", "关闭HBase连接时出错."),
    CLOSE_HBASE_TABLE_ERROR("HbaseReader-08", "关闭HBase 抽取表时出错."),
    CLOSE_HBASE_REGINLOCTOR_ERROR("HbaseReader-09", "关闭 HBase RegionLocator时出错."),
    CLOSE_HBASE_ADMIN_ERROR("HbaseReader-10", "关闭 HBase admin时出错.")
    ;

    private final String code;
    private final String description;

    private Hbase23xReaderErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return String.format("Code:[%s], Description:[%s].", this.code,
                this.description);
    }
}
