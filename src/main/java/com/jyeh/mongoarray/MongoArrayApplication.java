package com.jyeh.mongoarray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MongoArrayApplication {

    @Autowired
    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MongoArrayApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            mongoTemplate.insert(createMetadata(), Metadata.class);
        };
    }

    private List<Metadata> createMetadata() throws Exception {
        return Arrays.asList(
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-02")
                        .addIndex("GroupID", "100")
                        .addIndex("MemberID", "200"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-03")
                        .addIndex("GroupID", "100")
                        .addIndex("MemberID", "201"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-04")
                        .addIndex("GroupID", "101")
                        .addIndex("MemberID", "202"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-05")
                        .addIndex("GroupID", "101")
                        .addIndex("MemberID", "204"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-06")
                        .addIndex("GroupID", "102")
                        .addIndex("MemberID", "205"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-07")
                        .addIndex("GroupID", "102")
                        .addIndex("MemberID", "206"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-08")
                        .addIndex("GroupID", "103")
                        .addIndex("MemberID", "207"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-09")
                        .addIndex("GroupID", "103")
                        .addIndex("MemberID", "208"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-10")
                        .addIndex("GroupID", "104")
                        .addIndex("MemberID", "209"),
                Metadata.builder().documentType("type1").build()
                        .addDocumentDate("documentDate", "2019-08-01")
                        .addDocumentDate("effectiveDate", "2019-08-11")
                        .addIndex("GroupID", "104")
                        .addIndex("MemberID", "210")
                );
    }
}
