package com;

    /**
     1 ...Интерфейс ThingInterface содержит методы гет и сет для переменной name
     */
    /*interface ThingInterface {
        public void setName(String name);
        public String getName();
    }*/

    public class Box {
        /**
         2 ...content будет получать и возвращать содержимое чего-то
         */
        ThingInterface content;

        public ThingInterface getContent() {
            return content;
        }

        public void setContent(ThingInterface content) {
            this.content = content;
        }

    }

