/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package employeerostering.employeerostering;

/**
 * TODO Remove @XStreamConverter for java.time attributes once converters are provided by XStream out of the box.
 *
 * @see <a href="https://github.com/x-stream/xstream/issues/75">XStream#75</a>
 */
public class Timeslot implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @com.thoughtworks.xstream.annotations.XStreamConverter(org.kie.soup.commons.xstream.LocalDateTimeXStreamConverter.class)
    private java.time.LocalDateTime startTime;
    @com.thoughtworks.xstream.annotations.XStreamConverter(org.kie.soup.commons.xstream.LocalDateTimeXStreamConverter.class)
    private java.time.LocalDateTime endTime;

    public Timeslot() {
    }

    public java.time.LocalDateTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime( java.time.LocalDateTime startTime ) {
        this.startTime = startTime;
    }

    public java.time.LocalDateTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime( java.time.LocalDateTime endTime ) {
        this.endTime = endTime;
    }

    public Timeslot( java.time.LocalDateTime startTime,
                     java.time.LocalDateTime endTime ) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

}