package org.training.helpers;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.TypedArgumentConverter;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ConverterList extends TypedArgumentConverter<String, List> {
    protected ConverterList() {
        super(String.class, List.class);
    }

    @Override
    protected List<Integer> convert(String s) throws ArgumentConversionException {
        Pattern pattern = Pattern.compile(",");
        return pattern.splitAsStream(s).map(Integer::parseInt).toList();

    }
}
