package org.focusns.web.portal.config;

/*
 * #%L
 * FocusSNS Runtime
 * %%
 * Copyright (C) 2011 - 2013 FocusSNS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import org.springframework.core.Ordered;

import java.util.HashMap;
import java.util.Map;

public class WidgetConfig implements Ordered {

    private String id;
    private int order;
    private String title;
    private String target;
    private Map<String, Object> preferences = new HashMap<String, Object>();

    public WidgetConfig() {
    }

    public WidgetConfig(String id, String order, String target) {
        this.id = id;
        this.order = Integer.parseInt(order);
        this.target = target;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int getOrder() {
        return order;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTarget() {
        return target;
    }

    public Map<String, Object> getPreferences() {
        return preferences;
    }

    public void setPreference(Map<String, Object> preferences) {
        this.preferences = preferences;
    }

}
