/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.flyway.ddl.db.h2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.example.flyway.ddl.db.h2.tables.Author;
import org.jooq.example.flyway.ddl.db.h2.tables.Book;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.0-SNAPSHOT"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FlywayTest extends SchemaImpl {

    private static final long serialVersionUID = -520771476;

    /**
     * The reference instance of <code>FLYWAY_TEST</code>
     */
    public static final FlywayTest FLYWAY_TEST = new FlywayTest();

    /**
     * The table <code>FLYWAY_TEST.AUTHOR</code>.
     */
    public final Author AUTHOR = org.jooq.example.flyway.ddl.db.h2.tables.Author.AUTHOR;

    /**
     * The table <code>FLYWAY_TEST.BOOK</code>.
     */
    public final Book BOOK = org.jooq.example.flyway.ddl.db.h2.tables.Book.BOOK;

    /**
     * No further instances allowed
     */
    private FlywayTest() {
        super("FLYWAY_TEST", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.S_AUTHOR_ID);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Book.BOOK);
    }
}
