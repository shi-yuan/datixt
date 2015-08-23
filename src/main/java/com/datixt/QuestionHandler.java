package com.datixt;

import com.datixt.model.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(QuestionHandler.class);

    private final static List<Question> questions = new ArrayList<>();

    static {
        // TODO: 读取问题列表
    }

    /**
     * 获取问题
     *
     * @param excludedIds 需要排除的问题
     */
    public Question getQuestion(List<Integer> excludedIds) {
        LOGGER.info("excluded questions: {}", excludedIds);
        List<Question> list;
        if (!CollectionUtils.isEmpty(excludedIds)) {
            list = new ArrayList<>();
            for (Question q : questions) {
                if (excludedIds.contains(q.getId())) {
                    continue;
                }
                list.add(q);
            }
        } else {
            list = new ArrayList<>(questions);
        }
        return list.get((int) (Math.random() * list.size()));
    }
}
