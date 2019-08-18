package com.fengxiao.auto.example.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 分页
 */
@Setter
@Getter
public class ClientPage<V> extends ClientStatus {

    private int currentPage = 0;

    private int pageSize = 15;

    private int totalPage;

    private long totalCount;

    private List<V> data;

    public ClientPage() {
        super();
    }

    private ClientPage(List<V> data) {
        this.data = data;
    }

    private ClientPage(List<V> data,long totalCount) {
        this.data = data;
        this.totalCount = totalCount;
    }

    private ClientPage(List<V> data,long totalCount,int page, int pageSize) {
        this(data, totalCount);
        this.currentPage = page;
        this.pageSize = pageSize;
    }

    public static <V> ClientPage<V> ok(List<V> data) {
        return new ClientPage<>(data);
    }

    public static <V> ClientPage<V> ok(List<V> data, long totalCount,int page,int pageSize) {
        return new ClientPage<>(data,totalCount,page,pageSize);
    }

    public static <V> ClientPage<V> ok(List<V> data, long totalCount) {
        return new ClientPage<>(data,totalCount);
    }

}
