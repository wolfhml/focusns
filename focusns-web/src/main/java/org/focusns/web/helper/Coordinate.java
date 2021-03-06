package org.focusns.web.helper;

/*
 * #%L
 * FocusSNS Web
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

import java.io.File;

public class Coordinate {

    private Object projectId;
    private Object feature;
    private Object entity;
    private Object name;
    private Object dimension;

    public Coordinate(Object projectId, Object feature, Object entity, Object name) {
        this.projectId = projectId;
        this.feature = feature;
        this.entity = entity;
        this.name = name;
    }

    public void setDimension(Object dimension) {
        this.dimension = dimension;
    }

    public String toPath() {
        return toPath(true);
    }

    public String toPath(boolean includeDimension) {
        StringBuilder pathBuilder = new StringBuilder().append(File.separator).append("projects").append(File.separator).append(projectId).append(File.separator).append(feature).append(File.separator).append(entity).append(File.separator).append(name);
        //
        if (dimension != null && includeDimension) {
            pathBuilder.append("_").append(dimension);
        }
        //
        return pathBuilder.toString();
    }

}
