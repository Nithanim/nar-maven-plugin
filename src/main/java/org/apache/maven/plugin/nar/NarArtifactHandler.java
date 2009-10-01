package org.apache.maven.plugin.nar;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


import org.apache.maven.artifact.handler.ArtifactHandler;

/**
 * 
 * @author Mark Donszelmann
 * @version $Id: plugin/src/main/java/org/freehep/maven/nar/NarArtifactHandler.java 76e8ff7ad2b0 2007/07/24 04:15:54 duns $
 */
public class NarArtifactHandler implements ArtifactHandler {
	public String getPackaging() {
		return "nar";
	}

	public String getClassifier() {
		return null;
	}

	public String getDirectory() {
		return getExtension() + "s";
	}

	public String getExtension() {
		return "jar";
	}

	public String getLanguage() {
		return "java";
	}

	public boolean isAddedToClasspath() {
		return true;
	}

	public boolean isIncludesDependencies() {
		return false;
	}
}
