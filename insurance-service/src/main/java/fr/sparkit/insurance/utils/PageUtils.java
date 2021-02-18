package fr.sparkit.insurance.utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public final class PageUtils {

    public static final int PAGE_DEFAULT_SIZE = 10;
    public static final int FIRST_PAGE = 1;

    public static PageRequest createPagebleSortByDesc(int page, String fieldToSort) {
        return PageRequest.of(page - PageUtils.FIRST_PAGE, PageUtils.PAGE_DEFAULT_SIZE,
                Sort.by(Sort.Direction.DESC, fieldToSort));
    }

    public static Pageable applySortToPageable(Pageable pageable, String fieldToSort, Sort.Direction direction) {
        return PageRequest.of(pageable.getPageNumber() + 1 - PageUtils.FIRST_PAGE, pageable.getPageSize(),
                Sort.by(direction, fieldToSort));

    }


    public static Pageable createSortPageableFromFilter(int page,int pageSize, String fieldToSort, Sort.Direction direction) {
        return PageRequest.of(page - PageUtils.FIRST_PAGE, pageSize,
                Sort.by(direction, fieldToSort));

    }
}
