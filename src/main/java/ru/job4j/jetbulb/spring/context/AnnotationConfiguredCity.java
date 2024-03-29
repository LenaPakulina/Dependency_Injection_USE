package ru.job4j.jetbulb.spring.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.job4j.jetbulb.spring.context.city.City; 

public class AnnotationConfiguredCity {
    /**
     * Пример реализации IoC - инверсией управления.
     *
     * Отличия в xml файле. Он стал проще из-за аннотаций.
     * Список аннотаций, участвующих в конфигурировании, инициализации
     * сборке бизнес логики:
     * @Required используется для методов и конструкторов установщика.
     * Как следует из названия, он сообщает Spring, что эти поля необходимы для
     * правильной инициализации bean-компонента.
     * Если поля не заполнены во время настройки, компонент не сможет инициализироваться,
     * что приведет к исключению, и приложение не сможет построить
     *
     * @Autowired используется для дальнейшего контроля над внедрением зависимостей.
     * Он используется для подключения одного компонента к другому без создания экземпляра первого.
     *
     * @Qualifier используется для устранения случаев,
     * когда мы хотели бы автоматически подключить более одного bean-компонента одного типа.
     */
    public static void main(String[] args) {
        /**
         * В нашем примере мы добавили аннотацию Autowired для каждого
         * свойства, который должеен быть связан
         *
         * Если в Spring контейнере такой компонент (bean) создан
         * (с определенным именем), тогда он его подставит
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("city-annotation-context.xml");
        City city = context.getBean(City.class);
        System.out.println(city);
    }
}
