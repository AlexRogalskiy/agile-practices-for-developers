# Командный тренинг «Культура, процесс и инженерные практики LeSS в продуктовой разработке»
_Как поменять себя и процесс, чтобы втаскивать успешные продукты в большой компании._<br/>
24 ак. часа, 18 астр. часов.

# Objectives
- Тренинг задизайнен самобалансирующимся – знакомые и понятные темы прорабатываются быстро, а фокус на спорных и блокирующих темах.
- Все сделанные артефакты пойдут прямиком в производство
## После тренинга участники разделят общее видение, поймут ценность и ограничения:
### Продуктовая бизнес-модель
- *Видение продукта*
### Культура и процесс
- *Производственная культура* и в состоянии осозновать личную и командную культуры
- *Коллективная ответственность за результат* спринта
- *Процесс LeSS*
- *Принципы и метрики производственных систем*
- Принцип *Just in Time поставок* и практика *Time Boxing*
- *Кросс-функциональность* в команде
- *Кросс-командные коммуникации*
- *DoD*
- Общее и командное *планирование спринта*
- Общий и командный *Sprint review*
- Как померить *метрики*, характеризующие качество, через rework
- *Информационные радиаторы*
### Инженерия
- *Шаблоны коллективного владения системой* между участниками и командами
- *Шаблоны управления кодовой базой* и в состоянии выбрать из них
- Практика проектирования и общения *DDD*
- *Парная разработка*
- *User Story и Job Story*
- Ключевые внешние *NFRs*
- *Внутренняя модель качества* из обоснованных внутренних NFRs
- *Декомпозиция пользовательских историй*
- Принципы принятия *архитектурных решений и микро-дизайна* в условиях неопределенности и time boxing
- *Рефакторинг*, *внутреннее качество продукта* и *технический долг*
- *Code Review*
- *Автоматическая сборки* релиза
- *Статический анализ кода*
- *CI*
- *Автоматизированное тестирование* и базовые техники *тест-дизайна* и *анализа покрытия*
- *Системные, интеграционные и модульные тесты* и изоляция окружения с помощью *тест-дублеров*
- *Версионирование схемы БД*
- *CD*
- *TDD и ATDD*
- *Front-end tests*
- *BDD*
- *Культура DevOps*
- *Infrastructure as a Code*: контейнеризация и провиженинг стендов
- *SRE* и мониторинг *системных- и продуктовых метрик*

# Программа
## 1. Зачем мы собрались? (0.5 часа всего / _из них_ 0.25 часа практики и обсуждений)
1. Обзор тренинга
1. Договоренности
1. Знакомство с тренером
1. Парковка проблем участников
1. Выбор PO и разбивка по командам по "бразильской системе"

## Что такое продуктовый бизнес? (1/0.5)
1. Как вы определяете бизнес по цифровым продуктам?
1. Важнейшие особенности сегодня
- Снижение лояльности к брендам
- В запутанных системах бизнес-рынок-клиенты нельзя предсказывать
1. Подходы к неопределенности по модели Cynefin
1. Ключевые метрики
### Декларируем наши команды на разделение бизнес-ценностей
- Как вы поймете, что сделали бизнесу хорошо? Манифест команды
- На какие trade-offs придется пойти?
 - Сравнение с [LeSS](https://less.works/ru): [Customer Centric](https://less.works/ru/less/principles/customer-centric.html), [Whole Product Focus](https://less.works/ru/less/principles/whole-product-focus.html)

## Что продуктовый бизнес ждет от производства? (4.5/2.5)
### От культуры (1/0.5)
1. Понятие культуры
1. Роль производственной культуры
1. Групповая практика на определение производственной культуры
#### Декларируем наши команды на соответствие критериям
- Как вы поймете, что сделали бизнесу хорошо? Манифест команды + trade-offs
- Сравнение с [LeSS](https://less.works/ru): [self-management teams](https://less.works/ru/less/management/self-managing-teams.html), [role of manager](https://less.works/ru/less/management/role-of-manager.html), [transparency](https://less.works/ru/less/principles/transparency.html), [perfection](https://less.works/ru/less/principles/continuous-improvement-towards-perfection.html)

### От производственной системы (1.5/1)
1. Подход SLA к балансу бизнес-метрик: scope, time, quality, price, ?. Time-boxing.
1. Подход к запасам. JIT.
1. Подход к структуре команд: feature teams vs matrix. Свойства feature team
1. Подход к формализации/самоуправлению
1. Подход к ответственности
1. Подход к коммуникациям
1. Подход к экспертизе: фокусировка или кросс-функциональность. Практика Star Map.
#### Декларируем наши команды на соответствие критериям
- Чеклист по свойствам feature team
- Star Map
- Манифест команды + trade-offs
- Сравнение с [LeSS](https://less.works/ru): [принципы](https://less.works/ru/less/principles/index.html), [структура](https://less.works/ru/less/structure/index.html), [менеджмент](https://less.works/ru/less/management/index.html)

### От внутрикомандного процесса (1/0.5)
1. Подход к порядку реализации задач в рамках спринта: || vs -- и trade-offs. Принципы Kanban в сочетании со Scrum sprint
1. Подход к самобалансировке при разнотипных задачах
1. Подход к внутреннему качеству системы
1. Подход к описанию процесса: процедурный/декларативный. Практика DoD
1. Подход к обоснованности архитектуры через системное мышление: как обосновать инженерные решения (принятие trade-off и специализация). Демо обоснованности микро-дизайна
1. Подход к эволюции архитектуры: upfront/эволюционность+инкрементальность. Принципы Lean: откладывай@делегируй
#### Проектируем желаемый продуктовым бизнесом процесс
- Этапы итерации с DoDs
- Self-check: получился командный rugby scrum spring или водопадик-like sprint?
- Сравнение с [LeSS](https://less.works/ru): [внутреннее качество через иженерное совершенство](https://less.works/ru/less/technical-excellence/index.html), [самоуправление](https://less.works/ru/less/management/self-managing-teams.html), [эволюционность](https://less.works/ru/less/principles/lean-thinking.html), [системное мышление](https://less.works/ru/less/principles/systems-thinking.html)

### От масштабируемости процесса (1/0.5)
1. Подход к масштабированию: что масштабировать
1. Feature Teams Trade-off: обмен экспертизой и обеспечение целостности результата
#### Проектируем желаемый продуктовым бизнесом процесс
- Этапы общей межкомандной итерации с DoDs
- Как обеспечили дополнительные межкомандные связи
- Сравнение с [LeSS](https://less.works/ru): [feature teams](https://less.works/ru/less/structure/feature-teams.html), [communities](https://less.works/ru/less/structure/communities.html)

---

## Ретроспектива по вчерашнему дню (0.5/0.5)
- Закрытые цели тренинга
- Персональные инсайты
- 𝚫+
- Take-away actions
- Меппим на [LeSS](https://less.works/ru)

## Sprint PRODDEV-00: продуктовая модель (1.5/1)
1. Что такое product development?
1. Как сформулировать гипотезу продуктовой бизнес-модели? Формальные/неформальные подходы
1. На какие ключевые вопросы должна отвечать продуктовая гипотеза?
1. Зачем нужна metaphor/vision?
### Формулируем гипотезы продуктовой бизнес-модели
#### Даны
- Структура Lean Canvas
- Выбранный PO
#### Когда команды проведут
- Дизайн продуктовой гипотезы в формате Lean Canvas
- Фокусировка с помощью vision
- Меппинг на архитектурные риски
- Scope решения в терминах epics
#### Тогда на дебрифе
- Кросс-ревью vision
- Кросс-ревью продуктовых моделей
- PO сформирует итоговые vision и беклог на epics
#### Ретро

## Sprint PRODDEV-01: беклог как выражение продуктовой стратегии (1.5/1)
1. Что такое беклог? Какие ключевые свойства?
1. Как происходит управление элементами беклога? Порядок внесения новых элементов и жизненный цикл цикл.
1. Элементы беклога: Themes, Epics, Useк Stories, Job Stories
1. Как задавать NFRs: свойства историй и Системные/Инфраструктурные stories
1. Почему важно декомпозировать истории? Как обеспечить "тонкую нарезку"?
### Первичный дизайн беклога
#### Дано
- Практика User Story Mapping
- Практики декомпозиции историй
#### Когда
- Команды проведут USM
- Получат беклоги
#### Тогда на дебрифе
- Кросс-ревью командных беклогов
- PO обобщает единый беклог для всех команд
#### Ретро

## Переход к разработке: дизайн процесса через выбор практик (1.5/1)
1. Современное отношение к дизайну процессов: от императивности и формальности к декларативности и гибкости
1. Выбор практик как process design core
### Проектируем модель зрелости процесса через практики
#### Даны уровни зрелости *кросс-командного* процесса с т.з. продуктового бизнеса
1. Уровень: хоть как-то получаем хоть какой-то результат на prod
1. Уровень: управляем внешним качеством
1. Уровень: управляем внутренним качеством
1. Уровень: управляем TTM
1. Уровень: управляем успехом продукта
#### Когда
- Выбор в community трансформации
- Команды расставят практики из целей тренинга по уровням (+неуказанные)
- Команды отмечают текущий достигнутый уровень у них на производстве, там самым откидывая проработанные практики
- Команды отмечают дальнейшие по уровням практики, которые по их опыту содержат риски и неопределенность для фокуса тренинга на них. *Experience Poker* по критериям "Я четко знаю что это, используем на практике, знаю на опыте trade-offs по процессным и бизнес-метрикам, обучал этому/внедрял"
#### Тогда на дебрифе
- Кросс-ревью командных моделей зрелости
- Дополнение неназванных практик тренером
- Мерж в единую модель участниками community трансформации
- Процессный беклог: долг по внедрению практик для дальнейшей проработки в рамках тренинга
#### Ретро

## Sprint DEV-00: нулевой инфраструктурный спринт (1/0.5)
1. Уточнение требований, взятых в итерацию: что следует описать для единого понимания командой?
1. Архитектура в условиях внутренней неопредленности: как принимать решения по дизайну, когда не знаем точное поведение реализации или "не в теме" технологий?
### Анализ требований, существующей архитектуры системы и существующей инфраструктуры сборки
#### Даны
- Беклог
- Legacy codebase
- Парная работа, неактивные на этой итерации роли в паре с активными
#### Когда команды проведут анализ
- Требований
- Legacy системы
- Legacy инфраструктуры
#### Тогда на дебрифе
- План проверки инженерных гипотез
- Оценка scope следующей итерации
- Техничекий беклог (инженерный, компетенционный долги)
#### Ретро

---

## Ретроспектива по вчерашнему дню (0.5/0.5)
- Закрытые цели тренинга
- Персональные инсайты
- 𝚫+
- Take-away actions
- Меппим на [LeSS](https://less.works/ru)

## Sprint DEV-01 (1.5/1)
### Даны
- Беклог
- Инженерный беклог
- Процессный беклог
- Legacy codebase и инфраструктура
### Когда
- Команды проводят полноценный LeSS-спринт
- Парная работа, неактивные на этой итерации роли в паре с активными
### Тогда
- Sprint Review
- Помощь тренера по решению блокеров

## Sprint DEV-02 (1.5/1)
### Даны
- Беклог
- Инженерный беклог
- Процессный беклог
- Legacy codebase и инфраструктура
### Когда
- Команды проводят полноценный LeSS-спринт
- Парная работа, неактивные на этой итерации роли в паре с активными
### Тогда
- Sprint Review
- Помощь тренера по решению блокеров

## Sprint DEV-03 (1.5/1)
### Даны
- Беклог
- Инженерный беклог
- Процессный беклог
- Legacy codebase и инфраструктура
### Когда
- Команды проводят полноценный LeSS-спринт
- Парная работа, неактивные на этой итерации роли в паре с активными
### Тогда
- Sprint Review
- Помощь тренера по решению блокеров

## Обзор практик, которые не успели проработать (0.5/0)
На базе беклога процессной трансформации.

## Финальная ретроспектива (0.5/0.5)
### Даны
- Полученные на тренинге опыт
- Полученные на тренинге артефакты
### Когда
- Кросс-командная ретроспектива тренинга
### Тогда
- Закрытые цели тренинга
- Инсайты
- 𝚫+
- *Обоснованные* согласованные между командами next actions на производстве
- Итоговые *незакрытые* цели тренинга
