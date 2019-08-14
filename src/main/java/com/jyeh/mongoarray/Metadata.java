package com.jyeh.mongoarray;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Metadata {
    @Id
    private String id;
    private String documentType;
    private List<DocumentDate> documentDates;
    private List<DocumentIndex> indexes;

    public Metadata addDocumentDate(String fieldName, String dateString) {
        if (documentDates == null)
            documentDates = new ArrayList<>();
        documentDates.add(new DocumentDate(fieldName, DateUtils.parseDate(dateString)));
        return this;
    }

    public Metadata addIndex(String fieldName, String fieldValue) {
        if (indexes == null)
            indexes = new ArrayList<>();
        indexes.add(new DocumentIndex(fieldName, fieldValue));
        return this;
    }
}
