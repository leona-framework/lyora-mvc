package com.tealeaf.leona.mvc.client.logging;

import org.slf4j.MDC.MDCCloseable;

import java.util.List;
import java.util.function.Supplier;

@FunctionalInterface
public interface MdcContextSupplier extends Supplier<List<MDCCloseable>> {
    List<MDCCloseable> fillContext();

    @Override
    default List<MDCCloseable> get() {
        return fillContext();
    }
}
